package de.mdelab.ldbc_snb.parse;

public class NullStringTokenizer {

	private String string;
	private char delimiter;
	private int lastDelimiter = -1;
	
	public NullStringTokenizer(String string, char delimiter) {
		this.string = string;
		this.delimiter = delimiter;
	}

	public String nextToken(){
		if(lastDelimiter >= string.length()){
			return null;
		}
		
		int nextDelimiter = string.indexOf(delimiter, lastDelimiter + 1);
		if(nextDelimiter == -1){
			nextDelimiter = string.length();
		}
		if(nextDelimiter - lastDelimiter <= 1){
			lastDelimiter = nextDelimiter;
			return null;
		}
		String token = string.substring(lastDelimiter + 1, nextDelimiter);
		lastDelimiter = nextDelimiter;
		return token;
	}
}
