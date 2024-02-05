package de.mdelab.mlsdm.incremental.rete.tests;

import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleLocalizedQueryTest extends LocalizedQueryTest {

	@BeforeClass
	public static void setUp() {
		registerEPackages();
	}

	@Test
	public void testEdgeInputBatchPersistent() {
		testBatchQueryPersistent("simple_edge_input.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}
	
	@Test
	public void testEdgeInputIncrementalPersistent() {
		testIncrementalQueryPersistent("simple_edge_input.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}
	
	@Test
	public void testJoinBatchPersistent() {
		testBatchQueryPersistent("simple_join.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}
	
	@Test
	public void testJoinIncrementalPersistent() {
		testIncrementalQueryPersistent("simple_join.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}
	
}
