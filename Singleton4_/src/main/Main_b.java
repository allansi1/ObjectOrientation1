package main;

import b.lazyInitSingleton.*;

public class Main_b {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getINSTANCE();
		
		s1.setData(5);
		
		System.out.println("s1.data = "+s1.getData());
		
		
		Singleton s2 = Singleton.getINSTANCE();
		/* s2 est une nouvelle variable, mais elle a comme valeur le même objet que s1 */
		
		System.out.println("s2.data = "+s2.getData());
		
		s2.setData(10);
		
		System.out.println("s1.data = " + s1.getData());
		System.out.println("s2.data = " + s2.getData());

	}

}
