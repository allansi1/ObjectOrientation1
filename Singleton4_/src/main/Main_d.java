package main;

import d.multiSingleton.*;

public class Main_d {

	public static void main(String[] args) {

		Singleton aa = Singleton.getINSTANCE("MySQL");
		Singleton bb =  Singleton.getINSTANCE("MySQL");
		
		aa.setData(25);
		
		System.out.println("aa.getKey() = " + aa.getKey());
		System.out.println("aa.getData() = " + aa.getData());
		System.out.println("bb.getKey() = " + bb.getKey());
		System.out.println("bb.getData() = " + bb.getData());
		
		bb.setData(50);
		
		System.out.println("aa.getKey() = " + aa.getKey());
		System.out.println("aa.getData() = " + aa.getData());
		System.out.println("bb.getKey() = " + bb.getKey());
		System.out.println("bb.getData() = " + bb.getData());
		
		System.out.println("aa==bb: "+(aa==bb));
		
		Singleton  cc = Singleton.getINSTANCE("Oracle");
		cc.setData(80);
		
		System.out.println("aa.getKey() = " + aa.getKey());
		System.out.println("aa.getData() = " + aa.getData());
		System.out.println("bb.getKey() = " + bb.getKey());
		System.out.println("bb.getData() = " + bb.getData());
		System.out.println("cc.getKey() = " + cc.getKey());
		System.out.println("cc.getData() = " + cc.getData());
		
		System.out.println("aa==cc: "+(aa==cc));

	}

}
