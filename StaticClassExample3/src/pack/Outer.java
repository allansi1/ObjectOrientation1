package pack;

public class Outer {
	//Variables
	public int a = 0; //dynamic - il appartient aux objets de cette classe
	public static int b = 0;// static - il appartient à cette classe, pas aux objets
	
	//Construteur
	public Outer() {
		a = a + 1;
		b = b + 1; // va compter combien de fois on a utilisé ce constructeur
		
	}
	
	public class A {
		public int getAa () {
			return a;
		}
		public int getAb () {
			return b;
		}
		public static int getAbSt () {
			return b;
		}
	}
	
	public static class B {
		//public int getBa () {
		//	return a;
		//}
		public int getBb () {
			return b;
		}
		public static int getBbSt () {
			return b;
		}
	}

}
