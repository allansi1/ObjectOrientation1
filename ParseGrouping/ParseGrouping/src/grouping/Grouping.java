package grouping;

import maPileG.MaPileG;

public class Grouping {
	
	private static String open ="([{<";
	private static String close=")]}>";
	
	private static class Element{
		int pos;
		char c;
		private Element(int pos, char c) {
			this.pos=pos;
			this.c=c;
		}
	}
		
	public static void parse(String s) {
		
		MaPileG<Element> pile = new MaPileG<Element>();
		boolean error =false;
		int i;
		for(i=0; i<s.length() && (! error);i++) {
			if (open.indexOf(s.charAt(i))!=-1) {
				pile.push(new Element(i,s.charAt(i)));
			}
			if (close.indexOf(s.charAt(i))!=-1) {
				if (!pile.empty()) {
					if(open.indexOf(pile.top().c)==close.indexOf(s.charAt(i))) {
						pile.pop();
					}
					else {
						error=true;  // avec la pile non vide
					}
				}
				else {
					error=true;  // avec la pile vide
				}
			}
		}
		String msg="";
		if (!pile.empty()) {
			msg="Error: group delimiter "+ pile.top().c 
					       + " at position "+ pile.top().pos + " not closed";
		}		
		else if (error) {  // avec la pile vide
			i=i-1;			
			msg= "Error: group delimiter "+  s.charAt(i)
				       + " at position "+ i + " has no corresponding open delimiter";			
		}
		else {  // pile.empty() && (!error)
			msg= "String "+s+" is OK";
		}
		System.out.println(msg);			
	}
}
