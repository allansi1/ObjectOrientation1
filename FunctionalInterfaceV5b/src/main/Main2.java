package main;
import a.withFunctionalInterface.*;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Func1<Integer,Integer> m1 = new Func1<Integer,Integer>(){
			@Override
			public Integer run(Integer a) {
				return 10*a;
			}
		};
		System.out.println("m1.run(5)= " + m1.run(5));
		
		Func1<Integer,Integer> f1 = x -> 100*x;
		System.out.println("f1.run(5)= " + f1.run(5));
		
		Func1<String,Integer> f2 = x-> x.length();
		System.out.println("f2.run(\"Bonjour\"))= " + f2.run("Bonjour"));
		
		Func1<String,String> f3 = x-> x + " Bonsoir";
		System.out.println("f3.run(\"Bonjour\"))= " + f3.run("Bonjour"));
		

	}

}
