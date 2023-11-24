package c.liskovSolAbsCl;

import java.util.*;

public class Rectangle extends FormeRectangulaire {
	
	public Rectangle(){
		setCote(0,0);
	}
	
	public Rectangle(int c1, int c2){
		setCote(c1,c2);
	}
	
	public void setCote(int c1, int c2) {
		if (c1>=0) {this.c1=c1;}
		if (c2>=0) {this.c2=c2;}	
	}
}

