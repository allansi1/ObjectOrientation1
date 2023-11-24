package c.liskovSolAbsCl;

import java.util.*;

public abstract class FormeRectangulaire {
	
	protected int c1;
	protected int c2;
		
	public int getc1() {
		return this.c1;
	}
	
	public int getc2() {
		return this.c2;
	}
	
	public final int perimetre() {
		return 2*this.c1 + 2*this.c2;
	}
	
	public final int surface() {
		return this.c1*this.c2;
	}
	
	@Override 
	public String toString() {
		return "[" + getc1()+", "+ getc2()+"]";
	}

}
