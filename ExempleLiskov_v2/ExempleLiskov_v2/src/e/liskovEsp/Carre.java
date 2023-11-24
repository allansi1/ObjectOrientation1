package e.liskovEsp;

public class Carre {
	
	private int c1; 
	
	public Carre() {
		this.setc1(0);
	}
	
	public Carre(int c) {
		this.setc1(c);
	}
	
	protected void setc1(int c) {
		if(c>=0) {
			this.c1=c;
		}
	}
	
	public int getc1() {
		return c1; 
	}
	
	public int perimetre() {
		return 4*c1;
	}
	
	public int surface() {
		return c1*c1;
	}
	
	@Override 
	public String toString() {
		return "[" + getc1() + "]";
	}
}
