
package e.liskovEsp;

public class Rectangle extends Carre{
	
	private int c2; 
	
	public Rectangle() {
		this.setc1(0);
		this.setc2(0); 
	}
	
	public Rectangle(int c1, int c2) {
		this.setc1(c1);
		this.setc2(c2); 
	}	
	
	protected void setc2(int c) {
		if (c>=0) {this.c2=c;}
	}
	
	public int getc2() {
		return c2;
	}
	
	@Override
	public int perimetre() {
		return 2*this.getc1() + 2*this.getc2();
	}
	
	@Override
	public int surface() {
		return this.getc1()*this.getc2();
	}

	@Override 
	public String toString() {
		return "[" + getc1()+", "+ getc2()+"]";
	}
}
