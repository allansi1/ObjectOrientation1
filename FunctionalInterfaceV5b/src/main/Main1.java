package main;
import a.withFunctionalInterface.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functional1 m1 = new Functional1(){
			@Override
			public int run(int a) {
				return 10*a;
			}
		};
		System.out.println("m1.run(5)= " + m1.run(5));
		
		
		//Adicionar o lãmbda da funçao run que é 
		//os argumentos + o corpo da função representado pelo forma abaixo
		//(x) é o argumento -> separa o argumento e o corpo, { } representa
		//inclusão do corpo da função que foi criada na interface
		Functional1 m2 = (x)-> {return 100*x;};
		System.out.println("m2.run(5)= " + m2.run(5));
		
		Functional1 m3 = x-> x*1000;
		System.out.println("m3.run(5)= " + m3.run(5));
		
		System.out.println("((Functional1)x->200*x).run(5)= "+((Functional1)x->200*x).run(5) );
		
		System.out.println();
		System.out.println("The type of the interface is " + Functional1.class);
		System.out.println("The type of m1 is " + m1.getClass());
		System.out.println("The type of m2 is " + m2.getClass());
		System.out.println("The type of m3 is " + m3.getClass());
		
		

	}

}
