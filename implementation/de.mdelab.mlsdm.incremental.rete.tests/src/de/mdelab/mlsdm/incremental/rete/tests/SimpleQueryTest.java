package de.mdelab.mlsdm.incremental.rete.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.emf.ecore.EObject;
import org.junit.BeforeClass;
import org.junit.Test;

import de.mdelab.mlsdm.incremental.rete.dynamic.DynamicReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteAntiJoin;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteDomainFilter;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteEdgeInput;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteIndexer;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteJoin;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNodeInput;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;

public class SimpleQueryTest extends QueryTest {

	@BeforeClass
	public static void setUp() {
		registerEPackages();
	}

	@Test
	public void testSimpleNodeInputConstruction() {
		StoryPattern pattern = readPattern("resource/patterns/simple_node_input.mlsp");
		EObject model = getFullModel("persons_50.log");
		
		DynamicReteQueryManager manager = null;
		try {
			manager = createStaticReteQueryManager(pattern, model);
		} catch (SDMException e) {
			fail();
		}
		
		ReteNode resultProvider = manager.getCurrentNet().getRoot();
		ReteNode root = resultProvider.getPredecessors().get(0);		
		
		assertNotNull(root);
		assertTrue(root instanceof ReteDomainFilter);
		assertEquals(root.getPredecessors().size(), 1);
		
		ReteNode edgeInput = root.getPredecessors().get(0);
		assertTrue(edgeInput instanceof ReteNodeInput);
		assertEquals(edgeInput.getPredecessors().size(), 0);
	}

	@Test
	public void testSimpleEdgeInputConstruction() {
		StoryPattern pattern = readPattern("resource/patterns/simple_edge_input.mlsp");
		EObject model = getFullModel("persons_50.log");
		
		DynamicReteQueryManager manager = null;
		try {
			manager = createStaticReteQueryManager(pattern, model);
		} catch (SDMException e) {
			fail();
		}
		
		ReteNode resultProvider = manager.getCurrentNet().getRoot();
		ReteNode root = resultProvider.getPredecessors().get(0);		
		
		assertNotNull(root);
		assertTrue(root instanceof ReteDomainFilter);
		assertEquals(root.getPredecessors().size(), 1);
		
		ReteNode leftDomainFilter2 = root.getPredecessors().get(0);
		assertTrue(leftDomainFilter2 instanceof ReteDomainFilter);
		assertEquals(leftDomainFilter2.getPredecessors().size(), 1);
		
		ReteNode edgeInput = leftDomainFilter2.getPredecessors().get(0);
		assertTrue(edgeInput instanceof ReteEdgeInput);
		assertEquals(edgeInput.getPredecessors().size(), 0);
	}

	@Test
	public void testSimpleJoinConstruction() {
		StoryPattern pattern = readPattern("resource/patterns/simple_join.mlsp");
		EObject model = getFullModel("persons_50.log");
		
		DynamicReteQueryManager manager = null;
		try {
			manager = createStaticReteQueryManager(pattern, model);
		} catch (SDMException e) {
			fail();
		}
		
		ReteNode resultProvider = manager.getCurrentNet().getRoot();
		ReteNode root = resultProvider.getPredecessors().get(0);		
		
		assertNotNull(root);
		assertTrue(root instanceof ReteJoin);
		assertEquals(root.getPredecessors().size(), 2);
		
		//left argument
		ReteNode leftIndexer = root.getPredecessors().get(0);
		assertTrue(leftIndexer instanceof ReteIndexer);
		assertEquals(leftIndexer.getPredecessors().size(), 1);
		
		ReteNode leftDomainFilter1 = leftIndexer.getPredecessors().get(0);
		assertTrue(leftDomainFilter1 instanceof ReteDomainFilter);
		assertEquals(leftDomainFilter1.getPredecessors().size(), 1);
		
		ReteNode leftDomainFilter2 = leftDomainFilter1.getPredecessors().get(0);
		assertTrue(leftDomainFilter2 instanceof ReteDomainFilter);
		assertEquals(leftDomainFilter2.getPredecessors().size(), 1);
		
		ReteNode leftEdgeInput = leftDomainFilter2.getPredecessors().get(0);
		assertTrue(leftEdgeInput instanceof ReteEdgeInput);
		assertEquals(leftEdgeInput.getPredecessors().size(), 0);

		//right argument
		ReteNode rightIndexer = root.getPredecessors().get(1);
		assertTrue(rightIndexer instanceof ReteIndexer);
		assertEquals(rightIndexer.getPredecessors().size(), 1);
		
		ReteNode rightDomainFilter1 = rightIndexer.getPredecessors().get(0);
		assertTrue(rightDomainFilter1 instanceof ReteDomainFilter);
		assertEquals(rightDomainFilter1.getPredecessors().size(), 1);
		
		ReteNode rightDomainFilter2 = rightDomainFilter1.getPredecessors().get(0);
		assertTrue(rightDomainFilter2 instanceof ReteDomainFilter);
		assertEquals(rightDomainFilter2.getPredecessors().size(), 1);
		
		ReteNode rightEdgeInput = leftDomainFilter2.getPredecessors().get(0);
		assertTrue(rightEdgeInput instanceof ReteEdgeInput);
		assertEquals(rightEdgeInput.getPredecessors().size(), 0);
	}

	@Test
	public void testSimpleAntiJoinConstruction() {
		StoryPattern pattern = readPattern("resource/patterns/simple_anti_join.mlsp");
		EObject model = getFullModel("persons_50.log");
		
		DynamicReteQueryManager manager = null;
		try {
			manager = createStaticReteQueryManager(pattern, model);
		} catch (SDMException e) {
			fail();
		}
		
		ReteNode resultProvider = manager.getCurrentNet().getRoot();
		ReteNode root = resultProvider.getPredecessors().get(0);		
		
		assertNotNull(root);
		assertTrue(root instanceof ReteAntiJoin);
		assertEquals(root.getPredecessors().size(), 2);
		
		//left argument
		ReteNode leftIndexer = root.getPredecessors().get(0);
		assertTrue(leftIndexer instanceof ReteIndexer);
		assertEquals(leftIndexer.getPredecessors().size(), 1);
		
		ReteNode leftDomainFilter1 = leftIndexer.getPredecessors().get(0);
		assertTrue(leftDomainFilter1 instanceof ReteDomainFilter);
		assertEquals(leftDomainFilter1.getPredecessors().size(), 1);
		
		ReteNode leftDomainFilter2 = leftDomainFilter1.getPredecessors().get(0);
		assertTrue(leftDomainFilter2 instanceof ReteDomainFilter);
		assertEquals(leftDomainFilter2.getPredecessors().size(), 1);
		
		ReteNode leftEdgeInput = leftDomainFilter2.getPredecessors().get(0);
		assertTrue(leftEdgeInput instanceof ReteEdgeInput);
		assertEquals(leftEdgeInput.getPredecessors().size(), 0);

		//right argument
		ReteNode rightIndexer = root.getPredecessors().get(1);
		assertTrue(rightIndexer instanceof ReteIndexer);
		assertEquals(rightIndexer.getPredecessors().size(), 1);
		
		ReteNode rightDomainFilter1 = rightIndexer.getPredecessors().get(0);
		assertTrue(rightDomainFilter1 instanceof ReteDomainFilter);
		assertEquals(rightDomainFilter1.getPredecessors().size(), 1);
		
		ReteNode rightDomainFilter2 = rightDomainFilter1.getPredecessors().get(0);
		assertTrue(rightDomainFilter2 instanceof ReteDomainFilter);
		assertEquals(rightDomainFilter2.getPredecessors().size(), 1);
		
		ReteNode rightEdgeInput = leftDomainFilter2.getPredecessors().get(0);
		assertTrue(rightEdgeInput instanceof ReteEdgeInput);
		assertEquals(rightEdgeInput.getPredecessors().size(), 0);
	}

	@Test
	public void testSimpleNodeInputBatch() {
		testBatchQuery("simple_node_input.mlsp", "persons_50.log");
	}

	@Test
	public void testSimpleEdgeInputBatch() {
		testBatchQuery("simple_edge_input.mlsp", "persons_50.log");
	}

	@Test
	public void testSimpleJoinBatch() {
		testBatchQuery("simple_join.mlsp", "persons_50.log");
	}

	@Test
	public void testSimpleAntiJoinBatch() {
		testBatchQuery("simple_anti_join.mlsp", "persons_50.log");
	}
	
	@Test
	public void testSimpleNodeInputIncrementalStatic() {
		testIncrementalQueryStatic("simple_node_input.mlsp", "persons_50.log");
	}

	@Test
	public void testSimpleEdgeInputIncrementalStatic() {
		testIncrementalQueryStatic("simple_edge_input.mlsp", "persons_50.log");
	}

	@Test
	public void testSimpleJoinIncrementalStatic() {
		testIncrementalQueryStatic("simple_join.mlsp", "persons_50.log");
	}

	@Test
	public void testSimpleAntiJoinIncrementalStatic() {
		testIncrementalQueryStatic("simple_anti_join.mlsp", "persons_50.log");
	}
	
	@Test
	public void testSimpleNodeInputIncrementalDynamic() {
		testIncrementalQueryDynamic("simple_node_input.mlsp", "persons_50.log");
	}
	
	@Test
	public void testSimpleEdgeInputIncrementalDynamic() {
		testIncrementalQueryDynamic("simple_edge_input.mlsp", "persons_50.log");
	}
	
	@Test
	public void testSimpleJoinIncrementalDynamic() {
		testIncrementalQueryDynamic("simple_join.mlsp", "persons_50.log");
	}
	
	@Test
	public void testSimpleAntiJoinIncrementalDynamic() {
		testIncrementalQueryDynamic("simple_anti_join.mlsp", "persons_50.log");
	}
}
