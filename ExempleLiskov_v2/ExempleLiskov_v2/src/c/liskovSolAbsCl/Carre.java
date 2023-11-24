package c.liskovSolAbsCl;

import java.util.*;

public class Carre extends FormeRectangulaire {
	
	public Carre(){
		setCote(0);
	}
	
	public Carre(int c){
		setCote(c);	
	}
	
//	public void setCote(int c1, int c2) {
//		if(c1==c2) {
//			super.setCote(c1, c2);
//		}	
//	}
	
	public void setCote(int c) {
		if (c>=0) {this.c2=this.c1=c;}			
	}
}
