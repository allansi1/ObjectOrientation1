package main;

import b.lazyInitSingleton.*;

public class Main_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Singleton s1 = Singleton.getInstance();
		s1.setData(5);
		System.out.println("s1.data = " + s1.getData());
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2.data = " + s2.getData());
		s2.setData(10);
		System.out.println("s1.data = " + s1.getData());
		System.out.println("s2.data = " + s2.getData());
		

	}

}
