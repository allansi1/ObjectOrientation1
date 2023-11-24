package pack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Outer b = " + Outer.b);
			
		System.out.println("Outer a = " + new Outer().a);
		
		
		Outer v1 = new Outer();
		
		System.out.println("v1a = " + v1.a); // l'attribut "a" existe seulement dans les objets de la classe 
		System.out.println("v1b = " + v1.b);
		Outer v2 = new Outer();
		System.out.println("v2a = " + v2.a);
		System.out.println("v2b = " + v2.b);
		//===============================================================
		System.out.println();
		
		System.out.println("v1a = " + v1.a);  
		System.out.println("v1b = " + v1.b);
		System.out.println("v2a = " + v2.a);
		System.out.println("v2b = " + v2.b);
		
		v1.a=10;
		v1.b=20;
		System.out.println("Changement de v1");
		System.out.println("v1a = " + v1.a);  
		System.out.println("v1b = " + v1.b);
		System.out.println("v2a = " + v2.a);
		System.out.println("v2b = " + v2.b);
		new Outer();
		System.out.println("Outer b = " + Outer.b);
		
		//===============================================================
		System.out.println();
		
		//Outer.A o1 = new Outer().new A();
		System.out.println("==========================================================");
		Outer.A o1 = v1.new A(); // o1 est crée à partir de v1
		Outer.A o2 = v2.new A();
		System.out.println("v1a = " + v1.a);  
		System.out.println("v1b = " + v1.b);
		System.out.println("o1.getAa() = " + o1.getAa());
		System.out.println("o2.getAa() = " + o2.getAa());
		System.out.println("o1.getAb() = " +o1.getAb());
		System.out.println("o2.getAb() = " + o2.getAb());
		System.out.println("o1.getAbSt() = " +o1.getAbSt());
		System.out.println("o2.getAbSt() = " + o2.getAbSt());
		System.out.println("Outer.A.getAbSt( = " + Outer.A.getAbSt());
		System.out.println("==========================================================");
		System.out.println();
		
		Outer.B o3 = new Outer.B();
		System.out.println("o3.getBb() = " + o3.getBb());
		System.out.println("o3.getBbSt() = " + o3.getBbSt());
		System.out.println("Outer.B.getBbSt() = " + Outer.B.getBbSt());
		
		
		
		
		
	}

}
