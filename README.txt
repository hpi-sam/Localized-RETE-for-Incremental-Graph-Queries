Installation:
- download and install Eclipse Modeling Tools (e.g. via the Eclipse installer from https://www.eclipse.org/downloads/)
- add the Eclipse Neon update-site (http://download.eclipse.org/releases/neon/) to the list of registered update-sites
- install SDM-related Eclipse-Plugins (required for reading query specifications , i.e., .mlsp-files) from our update-site: https://www.hpi.uni-potsdam.de/giese/update-site/ ("SDM Metamodels, Editors, and Interpreters" category)
- install the VIATRA Eclipse-Plugins from the VIATRA update-site: https://download.eclipse.org/viatra/updates/release/

Tests
- the implementation/de.mdelab.ldbc.snb.incremental.rete.tests project contains test cases for validating the localized rete net construction techniques for a number of simple queries (SimpleLocalizedQueryTest) and more complex queries from the adapted LDBC SNB (LDBCLocalizedQueryTest)
- as host graph for these tests, a small dataset generated with the LDBC SNB data generator (https://github.com/ldbc/ldbc_snb_datagen_hadoop) is used

Replication
- the replication directory contains the prebuilt .jar files used for all experiments in the paper
- query specification for all strategies except for VIATRA can be found in the corresponding patterns directory
- metadata required for RETE net construction can be found in the corresponding data directory
- data for the experiments on real abstract syntax graphs (split into two parts due to GitHub's file size limit) and the LDBC SNB can be found in the corresponding data directory; data for the experiments on synthetic syntax graphs is generated programmatically