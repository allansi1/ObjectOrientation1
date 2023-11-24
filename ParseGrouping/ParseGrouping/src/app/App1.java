package app;

import grouping.*;

public class App1 {

	public static void main(String[] args) {
		String s1 = "{[()<>]}";
		String s2 = "{[()<>}";
		String s3 = "{[())<>]}";
		String s4 = "{[]}){()}";
		
		Grouping.parse(s1);
		Grouping.parse(s2);
		Grouping.parse(s3);
		Grouping.parse(s4);
	}

}
