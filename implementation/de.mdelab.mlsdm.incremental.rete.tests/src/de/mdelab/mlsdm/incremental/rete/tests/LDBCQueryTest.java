package de.mdelab.mlsdm.incremental.rete.tests;

import org.junit.BeforeClass;
import org.junit.Test;

public class LDBCQueryTest extends QueryTest {

	@BeforeClass
	public static void setUp() {
		registerEPackages();
	}

	//batch tests
	
	@Test
	public void testInteractive1Batch() {
		testBatchQuery("interactive_1.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive2Batch() {
		testBatchQuery("interactive_2.mlsp", "persons_50.log");
	}

//	skip this test as execution of interactive_3.mlsp is infeasible
//	due to excessive number of matches
//	@Test
//	public void testInteractive3() {
//		testBatchQuery("interactive_3.mlsp", "persons_50.log");
//	}
	
	@Test
	public void testInteractive4Batch() {
		testBatchQuery("interactive_4.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive5Batch() {
		testBatchQuery("interactive_5.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive6Batch() {
		testBatchQuery("interactive_6.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive7Batch() {
		testBatchQuery("interactive_7.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive8Batch() {
		testBatchQuery("interactive_8.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive9Batch() {
		testBatchQuery("interactive_9.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive10Batch() {
		testBatchQuery("interactive_10.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive11Batch() {
		testBatchQuery("interactive_11.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive12Batch() {
		testBatchQuery("interactive_12.mlsp", "persons_50.log");
	}

//	skip this test as execution of interactive_3_nac.mlsp is infeasible
//	with reference due to excessive number of matches for base pattern
//	@Test
//	public void testInteractive3NAC() {
//		testBatchQuery("interactive_3_nac.mlsp", "persons_50.log");
//	}

	@Test
	public void testInteractive4NACBatch() {
		testBatchQuery("interactive_4_nac.mlsp", "persons_50.log");
	}
	
	//incremental static tests
	
	@Test
	public void testInteractive1IncrementalStatic() {
		testIncrementalQueryStatic("interactive_1.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive2IncrementalStatic() {
		testIncrementalQueryStatic("interactive_2.mlsp", "persons_50.log");
	}

//	skip this test as execution of interactive_3.mlsp is infeasible
//	due to excessive number of matches
//	@Test
//	public void testInteractive3IncrementalStatic() {
//		testIncrementalQueryStatic("interactive_3.mlsp", "persons_50.log");
//	}
	
	@Test
	public void testInteractive4IncrementalStatic() {
		testIncrementalQueryStatic("interactive_4.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive5IncrementalStatic() {
		testIncrementalQueryStatic("interactive_5.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive6IncrementalStatic() {
		testIncrementalQueryStatic("interactive_6.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive7IncrementalStatic() {
		testIncrementalQueryStatic("interactive_7.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive8IncrementalStatic() {
		testIncrementalQueryStatic("interactive_8.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive9IncrementalStatic() {
		testIncrementalQueryStatic("interactive_9.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive10IncrementalStatic() {
		testIncrementalQueryStatic("interactive_10.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive11IncrementalStatic() {
		testIncrementalQueryStatic("interactive_11.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive12IncrementalStatic() {
		testIncrementalQueryStatic("interactive_12.mlsp", "persons_50.log");
	}

//	skip this test as execution of interactive_3_nac.mlsp is infeasible
//	with reference due to excessive number of matches for base pattern
//	@Test
//	public void testInteractive3NACIncrementalStatic() {
//		testIncrementalQueryStatic("interactive_3_nac.mlsp", "persons_50.log");
//	}

	@Test
	public void testInteractive4NACIncrementalStatic() {
		testIncrementalQueryStatic("interactive_4_nac.mlsp", "persons_50.log");
	}
	
	//incremental dynamic tests
	
	@Test
	public void testInteractive1IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_1.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive2IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_2.mlsp", "persons_50.log");
	}

//	skip this test as execution of interactive_3.mlsp is infeasible
//	due to excessive number of matches
//	@Test
//	public void testInteractive3IncrementalDynamic() {
//		testIncrementalQueryDynamic("interactive_3.mlsp", "persons_50.log");
//	}
	
	@Test
	public void testInteractive4IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_4.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive5IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_5.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive6IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_6.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive7IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_7.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive8IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_8.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive9IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_9.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive10IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_10.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive11IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_11.mlsp", "persons_50.log");
	}

	@Test
	public void testInteractive12IncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_12.mlsp", "persons_50.log");
	}

//	skip this test as execution of interactive_3_nac.mlsp is infeasible
//	with reference due to excessive number of matches for base pattern
//	@Test
//	public void testInteractive3NACIncrementalDynamic() {
//		testIncrementalQueryDynamic("interactive_3_nac.mlsp", "persons_50.log");
//	}

	@Test
	public void testInteractive4NACIncrementalDynamic() {
		testIncrementalQueryDynamic("interactive_4_nac.mlsp", "persons_50.log");
	}
	
}
