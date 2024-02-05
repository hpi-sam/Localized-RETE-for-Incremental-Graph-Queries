package de.mdelab.ldbc_snb.log;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBBidirectionalElementDeletion;
import de.mdelab.ldbc_snb.log.elements.LDBC_SNBElementAction;

public class LDBC_SNBBidirectionalLogReader extends LDBC_SNBLogReader {

	public LDBC_SNBBidirectionalLogReader(String logFile) throws IOException {
		super(logFile);
	}

	@Override
	protected void initializeReferenceIndex() {
		
	}
	
	@Override
	protected LDBC_SNBElementAction<? extends EObject> getPersonDeletion(
			String[] tuple, Map<Long, Person> createdPersons) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBBidirectionalElementDeletion(timestamp, createdPersons.get(id));
	}

	@Override
	protected LDBC_SNBElementAction<? extends EObject> getKnowsDeletion(
			String[] tuple, Map<Long, Map<Long, KnowsLink>> createdKnows) {
		long timestamp = Long.parseLong(tuple[1]);
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);

		KnowsLink k = createdKnows.get(sourceID).get(targetID);
		
		return new LDBC_SNBBidirectionalElementDeletion(timestamp, k);
	}

	@Override
	protected LDBC_SNBElementAction<? extends EObject> getPostDeletion(
			String[] tuple, Map<Long, Message> createdMessages) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBBidirectionalElementDeletion(timestamp, createdMessages.get(id));
	}

	@Override
	protected LDBC_SNBElementAction<? extends EObject> getCommentDeletion(
			String[] tuple, Map<Long, Message> createdMessages) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBBidirectionalElementDeletion(timestamp, createdMessages.get(id));
	}

	@Override
	protected LDBC_SNBElementAction<? extends EObject> getLikesDeletion(String[] tuple,
			Map<Long, Map<Long, LikesLink>> createdLikes) {
		long timestamp = Long.parseLong(tuple[1]);
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);

		LikesLink l = createdLikes.get(sourceID).get(targetID);
		return new LDBC_SNBBidirectionalElementDeletion(timestamp, l);
	}

	@Override
	protected LDBC_SNBElementAction<? extends EObject> getForumDeletion(
			String[] tuple, Map<Long, Forum> createdForums) {
		long timestamp = Long.parseLong(tuple[1]);
		long id = Long.parseLong(tuple[2]);
		return new LDBC_SNBBidirectionalElementDeletion(timestamp, createdForums.get(id));
	}

	@Override
	protected LDBC_SNBElementAction<? extends EObject> getMemberDeletion(
			String[] tuple, Map<Long, Map<Long, HasMemberLink>> createdMembers) {
		long timestamp = Long.parseLong(tuple[1]);
		long sourceID = Long.parseLong(tuple[2]);
		long targetID = Long.parseLong(tuple[3]);

		HasMemberLink l = createdMembers.get(sourceID).get(targetID);
		return new LDBC_SNBBidirectionalElementDeletion(timestamp, l);
	}

}
