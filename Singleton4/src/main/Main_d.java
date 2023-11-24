package main;

import d.multiSingleton.*;

public class Main_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton aa = Singleton.getInstance("MySQL");
		Singleton bb = Singleton.getInstance("MySQL");
		aa.setData(25);
		System.out.println("aa.getData() = " + aa.getData());
		System.out.println("aa.getKey() = " + aa.getKey());
		System.out.println("bb.getData() = " + bb.getData());
		System.out.println("bb.getKey() = " + bb.getKey());
		
		bb.setData(50);
		
		System.out.println("aa.getData() = " + aa.getData());
		System.out.println("aa.getKey() = " + aa.getKey());
		System.out.println("bb.getData() = " + bb.getData());
		System.out.println("bb.getKey() = " + bb.getKey());
		
		
		System.out.println("aa == bb " + (aa==bb));
		
		
		Singleton cc = Singleton.getInstance("Oracle");
		cc.setData(80);
		
		System.out.println("aa.getData() = " + aa.getData());
		System.out.println("aa.getKey() = " + aa.getKey());
		System.out.println("bb.getData() = " + bb.getData());
		System.out.println("bb.getKey() = " + bb.getKey());
		System.out.println("cc.getKey() = " + cc.getKey());
		System.out.println("cc.getData() = " + cc.getData());
		
		System.out.println("aa == cc " + (aa==cc));
		

	}

}
