package de.mdelab.ldbc_snb.log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.DynamicElement;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.IdentifiedElement;
import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;
import de.mdelab.ldbc_snb.University;
import de.mdelab.ldbc_snb.WorkAtLink;
import de.mdelab.ldbc_snb.parse.LDBC_SNBParser;

public class LDBC_SNBLogCreator {

	public static class Tuple<E1, E2> {

		public final E1 e1;
		public final E2 e2;

		private Tuple(E1 e1, E2 e2) {
			this.e1 = e1;
			this.e2 = e2;
		}

	}

	public static enum Action {
		CREATE, DELETE
	}

	public static final String PERSON = "PERSON";
	public static final String KNOWS = "KNOWS";
	public static final String POST = "POST";
	public static final String COMMENT = "COMMENT";
	public static final String TAG = "TAG";
	public static final String TAGCLASS = "TAGCLASS";
	public static final String CITY = "CITY";
	public static final String COUNTRY = "COUNTRY";
	public static final String LIKES = "LIKES";
	public static final String FORUM = "FORUM";
	public static final String MEMBER = "MEMBER";
	public static final String COMPANY = "COMPANY";
	public static final String UNIVERSITY = "UNIVERSITY";
	public static final String WORK = "WORK";
	public static final String STUDY = "STUDY";
	public static final String SEP = ";";

	public static final long DEFAULT_CREATION_TIME = 0;
	private static final long DEFAULT_DELETION_TIME = Long.MAX_VALUE;
	public static final long CITY_TIME = 1;
	public static final long ORGANIZATION_TIME = 2;
	private static final long MIN_LIFETIME = 1;
	private static final long DEFAULT_SEED = 1l;
	
	private static int DTS_REASSIGNEMENTS = 0;

	public static Map<TagClass, Long> TAG_CLASS_CREATIONS = new HashMap<TagClass, Long>();
	public static long TAG_TIME = 1;

	private long networkCollapse;
	private Random random;

	public void fixDeletions(LdbcSNBModel model) throws Exception {
		networkCollapse = findNetworkCollapse(model);
		random = new Random(DEFAULT_SEED);
		fixPersonDeletions(model);
		fixForumDeletions(model);
		fixPostDeletions(model);
		fixCommentDeletions(model);
	}

	private long findNetworkCollapse(LdbcSNBModel model) {
		long collapse = -1;
		for (Person p : model.getOwnedPersons()) {
			collapse = Math.max(collapse, getDts(p));
		}
		return collapse;
	}

	private void fixPersonDeletions(LdbcSNBModel model) throws Exception {
		for (Person p : model.getOwnedPersons()) {
			ensureDeletionConsistency(p);
		}
	}

	private void ensureDeletionConsistency(Person p) throws Exception {
		long cts = getCts(p);
		long dts = getDts(p);
		long minDts = cts + MIN_LIFETIME;
		long maxDts = networkCollapse;

		for (Message m : p.getOppHasCreator()) {
			minDts = Math.max(minDts, getCts(m));
			for (Comment c : m.getOppReplyOf()) {
				minDts = Math.max(minDts, getCts(c));
			}
		}
		for (KnowsLink k : p.getKnows()) {
			minDts = Math.max(minDts, getCts(k));
		}
		for (HasMemberLink h : p.getOppHasMember()) {
			minDts = Math.max(minDts, getCts(h));
		}
		for (LikesLink l : p.getLikes()) {
			minDts = Math.max(minDts, getCts(l));
		}

		assertConsistencyPossible(p, minDts, maxDts);

		if (!inInterval(dts, minDts, maxDts)) {
			assignRandomDts(p, minDts, maxDts);
		}
	}

	private void fixForumDeletions(LdbcSNBModel model) throws Exception {
		for (Forum f : model.getOwnedForums()) {
			ensureDeletionConsistency(f);
		}
	}
	private void ensureDeletionConsistency(Forum f) throws Exception { // TODO
																		// moderator
																		// currently
																		// not
																		// handled
																		// because
																		// not
																		// part
																		// of
																		// log
		long cts = getCts(f);
		long dts = getDts(f);
		long minDts = cts + MIN_LIFETIME;
		long maxDts = networkCollapse;

		for (Post m : f.getOppContainer()) {
			minDts = Math.max(minDts, getCts(m));
			for (Comment c : m.getOppReplyOf()) {
				minDts = Math.max(minDts, getCts(c));
			}
		}
		for (HasMemberLink h : f.getHasMember()) {
			minDts = Math.max(minDts, getCts(h));
		}

		assertConsistencyPossible(f, minDts, maxDts);

		if (!inInterval(dts, minDts, maxDts)) {
			assignRandomDts(f, minDts, maxDts);
		}
	}

	private void fixPostDeletions(LdbcSNBModel model) throws Exception {
		for (Post m : model.getOwnedPosts()) {
			ensureDeletionConsistency(m);
		}
	}

	private void ensureDeletionConsistency(Post m) throws Exception { // TODO
																		// problem:
																		// author
																		// may
																		// not
																		// be
																		// member
																		// of
																		// forum
																		// at
																		// the
																		// time
		long cts = getCts(m);
		long dts = getDts(m);
		long minDts = cts + MIN_LIFETIME;
		long maxDts = Math.min(getDts(m.getHasCreator()),
				getDts(m.getContainer()));

		for (Comment c : m.getOppReplyOf()) { // TODO consider replies
											// (transitive)
			minDts = Math.max(minDts, getCts(c));
		}
		for (LikesLink l : m.getOppLikes()) {
			minDts = Math.max(minDts, getCts(l));
		}

		assertConsistencyPossible(m, minDts, maxDts);

		if (!inInterval(dts, minDts, maxDts)) {
			assignRandomDts(m, minDts, maxDts);
		}
	}

	private void fixCommentDeletions(LdbcSNBModel model) throws Exception {
		for (Comment c : model.getOwnedComments()) {
			ensureDeletionConsistency(c);
		}
	}

	private void ensureDeletionConsistency(Comment c) throws Exception {
		long cts = getCts(c);
		long dts = getDts(c);
		long minDts = cts + MIN_LIFETIME;
		long maxDts = getDts(c.getHasCreator()); // TODO consider replyOf

		for (Comment reply : c.getOppReplyOf()) { // TODO consider replies
												// (transitive)
			minDts = Math.max(minDts, getCts(reply));
		}
		for (LikesLink l : c.getOppLikes()) {
			minDts = Math.max(minDts, getCts(l));
		}

		assertConsistencyPossible(c, minDts, maxDts);

		if (!inInterval(dts, minDts, maxDts)) {
			assignRandomDts(c, minDts, maxDts);
		}
	}

	private void assertConsistencyPossible(DynamicElement e, long minDts,
			long maxDts) throws Exception {
		if (minDts > maxDts) {
			throw new Exception("Unavoidable inconsistency for element " + e);
		}
	}

	private boolean inInterval(long dts, long minDts, long maxDts) {
		return dts >= minDts && dts <= maxDts;
	}

	private void assignRandomDts(DynamicElement e, long minDts, long maxDts) {
		long maxOffset = maxDts - minDts;
		long l = random.nextLong();
		l = l > 0 ? l : -l;
		long offset = l % (maxOffset + 1);
		e.setDts(minDts + offset);
		DTS_REASSIGNEMENTS ++;
	}

	public void generateLogFromModel(LdbcSNBModel model, boolean writeDeletions, boolean removeDeletionTail, String outputFile)
			throws IOException {
		List<Tuple<Action, EObject>> actions = new ArrayList<Tuple<Action, EObject>>();
		addActions(actions, model.getOwnedPersons());
		addActions(actions, model.getOwnedKnowsLinks());
		addActions(actions, model.getOwnedPosts());
		addActions(actions, model.getOwnedComments());
		addActions(actions, model.getOwnedTags());
		addActions(actions, model.getOwnedTagClasses());
		addActions(actions, model.getOwnedCities());
		addActions(actions, model.getOwnedCountries());
		addActions(actions, model.getOwnedLikesLinks());
		addActions(actions, model.getOwnedForums());
		addActions(actions, model.getOwnedHasMemberLinks());
		addActions(actions, model.getOwnedCompanies());
		addActions(actions, model.getOwnedUniversities());
		addActions(actions, model.getOwnedWorkAtLinks());
		addActions(actions, model.getOwnedStudyAtLinks());

		computeTagClassCreations(model.getOwnedTagClasses());

		Collections.sort(actions, new Comparator<Tuple<Action, EObject>>() {

			@Override
			public int compare(Tuple<Action, EObject> o1,
					Tuple<Action, EObject> o2) {
				long ts1 = o1.e1 == Action.CREATE
						? getCts(o1.e2)
						: getDts(o1.e2);
				long ts2 = o2.e1 == Action.CREATE
						? getCts(o2.e2)
						: getDts(o2.e2);
				int result = Long.compare(ts1, ts2);

				if (result == 0) {
					if (isIdentifiedElement(o1.e2)
							&& !isIdentifiedElement(o2.e2)) {
						result = 1;
					} else if (!isIdentifiedElement(o1.e2)
							&& isIdentifiedElement(o2.e2)) {
						result = -1;
					}
				}

				return result;
			}

		});
		
		if(removeDeletionTail) {
			Tuple<Action, EObject> action = actions.get(actions.size() - 1);
			while(getDts(action.e2) >= networkCollapse || action.e1 == Action.DELETE) {
				actions.remove(actions.size() - 1);
				action = actions.get(actions.size() - 1);
			}
		}
		
		writeObjects(actions, writeDeletions, outputFile);
	}

	private void addActions(List<Tuple<Action, EObject>> actions,
			EList<? extends EObject> objects) {
		for (EObject o : objects) {
			actions.add(new Tuple<Action, EObject>(Action.CREATE, o));
			if (isDynamic(o)) {
				actions.add(new Tuple<Action, EObject>(Action.DELETE, o));
			}
		}
	}

	protected void writeObjects(List<Tuple<Action, EObject>> actions,
			boolean writeDeletions, String outputFile) throws IOException {
		OutputStreamWriter fw = new OutputStreamWriter(
				new FileOutputStream(outputFile), StandardCharsets.UTF_8);
		for (Tuple<Action, EObject> action : actions) {
			if(writeDeletions || action.e1 != Action.DELETE) {
				writeAction(action, fw);
			}
		}
		fw.flush();
		fw.close();
	}

	protected void writeAction(Tuple<Action, EObject> action,
			OutputStreamWriter fw) throws IOException {
		if (action.e1 == Action.CREATE) {
			writeObjectCreation(action.e2, fw);
		} else {
			writeObjectDeletion(action.e2, fw);
		}
	}

	private void computeTagClassCreations(EList<TagClass> tagClasses) {
		Set<TagClass> classes = new HashSet<TagClass>(tagClasses);
		long current = 0;
		while (!classes.isEmpty()) {
			Set<TagClass> removed = new HashSet<TagClass>();
			for (TagClass tc : classes) {
				boolean remove = true;
				for (TagClass superClass : tc.getIsSubclassOf()) {
					if (classes.contains(superClass)) {
						remove = false;
						break;
					}
				}
				if (remove) {
					removed.add(tc);
				}
			}

			for (TagClass tc : removed) {
				classes.remove(tc);
				TAG_CLASS_CREATIONS.put(tc, current);
			}
			current++;
		}
		TAG_TIME = current;
	}

	protected void writeObjectCreation(EObject o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Action.CREATE.toString());
		fw.write('_');
		fw.write(getType(o));
		fw.write(SEP);
		fw.write(Long.toString(getCts(o)));
		fw.write(SEP);

		if (o.eClass() == Ldbc_snbPackage.Literals.PERSON) {
			writePerson((Person) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.KNOWS_LINK) {
			writeKnowsLink((KnowsLink) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.POST) {
			writePost((Post) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.COMMENT) {
			writeComment((Comment) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.TAG) {
			writeTag((Tag) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.TAG_CLASS) {
			writeTagClass((TagClass) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.CITY) {
			writeCity((City) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.COUNTRY) {
			writeCountry((Country) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.LIKES_LINK) {
			writeLikes((LikesLink) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.FORUM) {
			writeForum((Forum) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.HAS_MEMBER_LINK) {
			writeMember((HasMemberLink) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.COMPANY) {
			writeCompany((Company) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.UNIVERSITY) {
			writeUniversity((University) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.WORK_AT_LINK) {
			writeWork((WorkAtLink) o, fw);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.STUDY_AT_LINK) {
			writeStudy((StudyAtLink) o, fw);
		}

		fw.write("\n");
	}

	protected void writeObjectDeletion(EObject o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Action.DELETE.toString());
		fw.write('_');
		fw.write(getType(o));
		fw.write(SEP);
		fw.write(Long.toString(getDts(o)));
		fw.write(SEP);

		writeIds(o, fw);

		fw.write("\n");
	}

	protected void writeIds(EObject o, OutputStreamWriter fw) throws IOException {
		if (isIdentifiedElement(o)) {
			fw.write(Long.toString(((IdentifiedElement) o).getID()));
		} else if (o.eClass() == Ldbc_snbPackage.Literals.LIKES_LINK) {
			fw.write(Long.toString(((LikesLink) o).getOppLikes().getID()));
			fw.write(SEP);
			fw.write(Long.toString(((LikesLink) o).getLikes().getID()));
		} else if (o.eClass() == Ldbc_snbPackage.Literals.HAS_MEMBER_LINK) {
			fw.write(Long.toString(((HasMemberLink) o).getOppHasMember().getID()));
			fw.write(SEP);
			fw.write(Long.toString(((HasMemberLink) o).getHasMember().getID()));
		} else if (o.eClass() == Ldbc_snbPackage.Literals.KNOWS_LINK) {
			fw.write(Long.toString(((KnowsLink) o).getKnows().getID()));
			fw.write(SEP);
			fw.write(Long.toString(((KnowsLink) o).getOppKnows().getID()));
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void writeTagClass(TagClass o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(o.getName());
		for (TagClass tc : o.getIsSubclassOf()) {
			fw.write(SEP);
			fw.write(Long.toString(tc.getID()));
		}
	}

	private void writeStudy(StudyAtLink o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getOppStudyAt().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getStudyAt().getID()));
	}

	private void writeWork(WorkAtLink o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Integer.toString(o.getWorkFrom()));
		fw.write(SEP);
		fw.write(Long.toString(o.getOppWorkAt().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getWorkAt().getID()));
	}

	private void writeUniversity(University o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getIsLocatedIn().getID()));
	}

	private void writeCompany(Company o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getIsLocatedIn().getID()));
	}

	private void writeMember(HasMemberLink o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getOppHasMember().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getHasMember().getID()));
	}

	private void writeForum(Forum o, OutputStreamWriter fw) throws IOException {
		fw.write(Long.toString(o.getID()));
	}

	private void writeLikes(LikesLink o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getOppLikes().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getLikes().getID()));
	}

	private void writeCountry(Country o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(o.getName());
	}

	private void writeCity(City o, OutputStreamWriter fw) throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getIsPartOf().getID()));
	}

	private void writeTag(Tag o, OutputStreamWriter fw) throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(o.getName());
		for (TagClass tc : o.getHasType()) {
			fw.write(SEP);
			fw.write(Long.toString(tc.getID()));
		}
	}

	protected void writePost(Post o, OutputStreamWriter fw) throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(
				o.getContent() != null ? o.getContent().replace(SEP, ".") : "");
		fw.write(SEP);
		fw.write(Long.toString(o.getHasCreator().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getIsLocatedIn().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getContainer().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getOppSuccessor() != null ? o.getOppSuccessor().getID() : -1));
		for (Tag t : o.getHasTag()) {
			fw.write(SEP);
			fw.write(Long.toString(t.getID()));
		}
	}

	private void writeComment(Comment o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getHasCreator().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getIsLocatedIn().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getReplyOf().getID()));
		for (Tag t : o.getHasTag()) {
			fw.write(SEP);
			fw.write(Long.toString(t.getID()));
		}
	}

	private void writePerson(Person o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getID()));
		fw.write(SEP);
		fw.write(o.getFirstName());
		fw.write(SEP);
		fw.write(Long.toString(o.getIsLocatedIn().getID()));
		for (Tag t : o.getHasInterest()) {
			fw.write(SEP);
			fw.write(Long.toString(t.getID()));
		}
	}

	private void writeKnowsLink(KnowsLink o, OutputStreamWriter fw)
			throws IOException {
		fw.write(Long.toString(o.getOppKnows().getID()));
		fw.write(SEP);
		fw.write(Long.toString(o.getKnows().getID()));
	}

	protected long getCts(EObject o) {
		if (o.eClass() == Ldbc_snbPackage.Literals.POST) {
			return Math.max(((Post) o).getCreationDate(),
					((Post) o).getContainer().getCreationDate() + 1);
		} else if (o.eClass().getEAllSuperTypes()
				.contains(Ldbc_snbPackage.Literals.DYNAMIC_ELEMENT)) {
			return ((DynamicElement) o).getCts();
		} else if (o.eClass() == Ldbc_snbPackage.Literals.CITY) {
			return CITY_TIME;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.TAG) {
			return TAG_TIME;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.TAG_CLASS) {
			return TAG_CLASS_CREATIONS.get(o);
		} else if (o.eClass() == Ldbc_snbPackage.Literals.COMPANY) {
			return ORGANIZATION_TIME;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.UNIVERSITY) {
			return ORGANIZATION_TIME;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.WORK_AT_LINK) {
			return ((WorkAtLink) o).getOppWorkAt().getCreationDate() + 1;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.STUDY_AT_LINK) {
			return ((StudyAtLink) o).getOppStudyAt().getCreationDate() + 1;
		}
		return DEFAULT_CREATION_TIME;
	}

	protected long getDts(EObject o) {
		if (o.eClass() == Ldbc_snbPackage.Literals.LIKES_LINK) {
			LikesLink l = (LikesLink) o;
			return Math.min(Math.min(l.getDts(), l.getLikes().getDts()),
					l.getOppLikes().getDts());
		} else if (o.eClass() == Ldbc_snbPackage.Literals.HAS_MEMBER_LINK) {
			HasMemberLink l = (HasMemberLink) o;
			return Math.min(Math.min(l.getDts(), l.getOppHasMember().getDts()),
					l.getHasMember().getDts());
		} else if (o.eClass() == Ldbc_snbPackage.Literals.KNOWS_LINK) {
			KnowsLink l = (KnowsLink) o;
			return Math.min(Math.min(l.getDts(), l.getOppKnows().getDts()),
					l.getKnows().getDts());
		} else if (isDynamic(o)) {
			return ((DynamicElement) o).getDts();
		} else {
			return DEFAULT_DELETION_TIME;
		}
	}

	private boolean isDynamic(EObject o) {
		return o.eClass().getEAllSuperTypes()
				.contains(Ldbc_snbPackage.Literals.DYNAMIC_ELEMENT);
	}

	private boolean isIdentifiedElement(EObject o) {
		return o.eClass().getEAllSuperTypes()
				.contains(Ldbc_snbPackage.Literals.IDENTIFIED_ELEMENT);
	}

	protected String getType(EObject o) {
		if (o.eClass() == Ldbc_snbPackage.Literals.PERSON) {
			return PERSON;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.KNOWS_LINK) {
			return KNOWS;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.POST) {
			return POST;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.COMMENT) {
			return COMMENT;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.TAG) {
			return TAG;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.TAG_CLASS) {
			return TAGCLASS;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.CITY) {
			return CITY;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.COUNTRY) {
			return COUNTRY;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.LIKES_LINK) {
			return LIKES;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.FORUM) {
			return FORUM;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.HAS_MEMBER_LINK) {
			return MEMBER;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.COMPANY) {
			return COMPANY;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.UNIVERSITY) {
			return UNIVERSITY;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.WORK_AT_LINK) {
			return WORK;
		} else if (o.eClass() == Ldbc_snbPackage.Literals.STUDY_AT_LINK) {
			return STUDY;
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			System.out.println("2 arguments: dataDir, linkPosts");
			return;
		}

		String dataDir = args[0];
		String outputFile = dataDir + "/stream.csv";
		boolean linkPosts = Boolean.parseBoolean(args[1]);
		
		LdbcSNBModel model = (LdbcSNBModel) LDBC_SNBParser.parseGraph(dataDir)
				.get(0);
		if(linkPosts) {
			linkPosts(model);
		}
		LDBC_SNBLogCreator creator = new LDBC_SNBLogCreator();
		try {
			creator.fixDeletions(model);
			System.out.println("total dynamic elements:\t" + countDynamicElements(model));
			System.out.println("dts reassignments:\t" + DTS_REASSIGNEMENTS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		creator.generateLogFromModel(model, true, true, outputFile);
	}

	private static void linkPosts(LdbcSNBModel model) {
		for(Person p:model.getOwnedPersons()) {
			List<Post> posts = new ArrayList<Post>();
			for(Message m:p.getOppHasCreator()) {
				if(m.eClass() == Ldbc_snbPackage.Literals.POST) {
					posts.add((Post) m);
				}
			}
			
			Collections.sort(posts, new Comparator<Post>() {

				@Override
				public int compare(Post o1, Post o2) {
					return Long.compare(o1.getCreationDate(), o2.getCreationDate());
				}
				
			});
			
			for(int i = 0; i < posts.size() - 1; i++) {
				posts.get(i + 1).setOppSuccessor(posts.get(i));
			}
		}
	}

	private static int countDynamicElements(LdbcSNBModel model) {
		return model.getOwnedPersons().size() +
				model.getOwnedForums().size() + 
				model.getOwnedPosts().size() +
				model.getOwnedComments().size() +
				model.getOwnedKnowsLinks().size() +
				model.getOwnedHasMemberLinks().size() +
				model.getOwnedLikesLinks().size();
	}

}
