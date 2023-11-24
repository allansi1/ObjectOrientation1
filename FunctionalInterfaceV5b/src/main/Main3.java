package main;

import b.withAbstractClass.Functional2;


public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functional2 m1 = new Functional2(){
			@Override
			public int run(int a) {
				return 10*a;
			}
		};
		
		//Functional2 m2= (x)->100*x;
		//Assinatura Lambda não funciona para abstract class
		System.out.println("m1.run(5)= " + m1.run(5));
		System.out.println();
		System.out.println("The type of the abstract class is " + Functional2.class);
		System.out.println("The type of m1 is " + m1.getClass());

	}

}
