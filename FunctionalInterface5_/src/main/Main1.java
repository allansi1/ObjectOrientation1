package main;

import a.withFunctionalInterface.*;

public class Main1 {

	public static void main(String[] args) {
		
       Functional1 m1= new Functional1() {
    	   @Override 
    	   public int run(int a) {
    		   return 10*a;
    	   }
       };
       
       System.out.println("m1.run(5) = "+m1.run(5));
       
       Functional1 m2= (x)-> {return 100*x;};
       
       System.out.println("m2.run(5) = "+m2.run(5));
       
       Functional1 m3= x-> 1000*x;
       
       System.out.println("m3.run(5) = "+m3.run(5));
       
       System.out.println("((Functional1)x-> 200*x).run(5) = " + 
    		   					((Functional1)x-> 200*x).run(5));
       
       System.out.println();
       System.out.println("The type of the interface is " + Functional1.class);   // the type of the interface itself 
       System.out.println("The type of m1 is " + m1.getClass());
       System.out.println("The type of m2 is " + m2.getClass());
       System.out.println("The type of m3 is " + m3.getClass()); 
      
	}
}
