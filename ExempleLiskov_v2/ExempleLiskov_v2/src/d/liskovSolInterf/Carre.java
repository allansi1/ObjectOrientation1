package d.liskovSolInterf;

import java.util.*;

public class Carre implements IFormeRectangulaire {
	
	private int c;
		
	public Carre(){
		setCote(0);
	}
	
	public Carre(int c){
		setCote(c);	
	}
	
	@Override
	public int getc1() {
		return this.c;
	}
	
	@Override
	public int getc2() {
		return this.c;
	}
	
	public void setCote(int c) {
		if (c>=0) {this.c=c;}			
	}
	
	@Override
	public String toString() {
		return "[" + getc1()+", "+ getc2()+"]";
	}
}
