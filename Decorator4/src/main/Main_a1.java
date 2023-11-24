package main;

import a.withAbstractClass.*;

public class Main_a1 {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3,4);
		System.out.println("cote de r1:");
		System.out.println(r1.getSh());
		System.out.println(r1.getSv());
		System.out.println(r1);
		
		System.out.println("Perimetre de r1: "+r1.perimeter());
		System.out.println("aire de r1: "+r1.area());
		
		AbsPolygon r2 = new Rectangle(6,9);
		System.out.println("cote de r2:");
		System.out.println( ((Rectangle)r2).getSh() );
		System.out.println( ((Rectangle)r2).getSv());
		System.out.println(r2);
				
		System.out.println("Perimetre de r2: "+r2.perimeter());		
		System.out.println("aire de r2: "+r2.area());
		
		Square s1 = new Square(3);
		System.out.println("cote de s1:"+s1.getS());
		System.out.println(s1);
		System.out.println("Perimetre de s1: "+s1.perimeter());
		System.out.println("aire de s1: "+s1.area());
		
		Triangle t1 = new Triangle (3,4,5);
		System.out.println("cote de t1:"+t1.getS1()+", "+t1.getS2()+", "+t1.getS3());
		System.out.println(t1);
		System.out.println("Perimetre de t1: "+t1.perimeter());
		System.out.println("aire de t1: "+t1.area());
	}
}
