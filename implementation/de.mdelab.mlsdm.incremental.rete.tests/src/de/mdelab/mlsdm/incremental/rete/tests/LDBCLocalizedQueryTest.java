package de.mdelab.mlsdm.incremental.rete.tests;

import org.junit.BeforeClass;
import org.junit.Test;

public class LDBCLocalizedQueryTest extends LocalizedQueryTest {

	@BeforeClass
	public static void setUp() {
		registerEPackages();
	}

	@Test
	public void testInteractive1BatchPersistent() {
		testBatchQueryPersistent("interactive_1.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive2BatchPersistent() {
		testBatchQueryPersistent("interactive_2.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

//	skip interactive_3.mlsp as execution this query is infeasible
//	due to excessive number of matches
	
	@Test
	public void testInteractive4BatchPersistent() {
		testBatchQueryPersistent("interactive_4.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive5BatchPersistent() {
		testBatchQueryPersistent("interactive_5.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive6BatchPersistent() {
		testBatchQueryPersistent("interactive_6.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive7BatchPersistent() {
		testBatchQueryPersistent("interactive_7.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive8BatchPersistent() {
		testBatchQueryPersistent("interactive_8.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive9BatchPersistent() {
		testBatchQueryPersistent("interactive_9.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive10BatchPersistent() {
		testBatchQueryPersistent("interactive_10.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive11BatchPersistent() {
		testBatchQueryPersistent("interactive_11.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive12BatchPersistent() {
		testBatchQueryPersistent("interactive_12.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}
	
	// Incremental
	
	@Test
	public void testInteractive1IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_1.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive2IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_2.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}
	
//	skip interactive_3.mlsp as execution this query is infeasible
//	due to excessive number of matches
	
	@Test
	public void testInteractive4IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_4.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive5IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_5.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive6IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_6.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive7IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_7.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive8IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_8.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive9IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_9.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive10IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_10.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive11IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_11.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

	@Test
	public void testInteractive12IncrementalPersistent() {
		testIncrementalQueryPersistent("interactive_12.mlsp", "persons_50.log", "persons_50_metadata.txt");
	}

}
