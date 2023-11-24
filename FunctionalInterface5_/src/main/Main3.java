package main;

import b.withAbstractClass.*;

public class Main3 {

	public static void main(String[] args) {
		
		/* Actually there is no "Functional Abstract Class" 
		 * We cannot use Functional2 with Lambda functions 
		 * as we have done with Functional1 in Main1.
		 * */
		
		 Functional2 m1= new Functional2() {
	    	   @Override 
	    	   public int run(int a) {
	    		   return 10*a;
	    	   }
	       };
	       
	       System.out.println("m1.run(5) = "+m1.run(5));
	       
	       System.out.println();
	       System.out.println("The type of the abstract class is " + Functional2.class);   // the type of the interface itself 
	       System.out.println("The type of m1 is " + m1.getClass());
	            
	}
}
