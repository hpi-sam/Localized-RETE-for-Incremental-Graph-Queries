package de.mdelab.ldbc_snb.parse;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

public abstract class Parser<E> {
	
	public static FilenameFilter CSV_FILTER = new FilenameFilter() {

		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".csv");
		}
		
	};
	
	public Map<Long, E> parse(String dataDir){
		Map<Long, E> result = doParse(dataDir);
		return result;
	}
	
	public abstract String getName();
	
	protected abstract Map<Long, E> doParse(String dataDir);
}
