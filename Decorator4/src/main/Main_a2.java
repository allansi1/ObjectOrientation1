package main;

import java.util.*;
import a.withAbstractClass.*;

public class Main_a2 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3,4);
		System.out.println("cote de r1:");
		System.out.println(r1.getSh());
		System.out.println(r1.getSv());
		System.out.println(r1);
		
		ColorPolygon cp = new ColorPolygon(r1);
		System.out.println(cp.getColor());
		cp.setColor(Colors.ROUGE);
		System.out.println(cp.getColor());
		System.out.println(cp);
		
		r1.setSides(30, 40);
		System.out.println(cp);
		
	//==============================================================================	
		
		System.out.println("Couleur de cp : "+ cp.getColor());
		ColorPolygon cp2 = new ColorPolygon(cp);
		System.out.println("Couleur de cp2 : "+ cp2.getColor());
		cp2.setColor(Colors.VERT);
		System.out.println("Couleur de cp : "+ cp.getColor());
		System.out.println("Couleur de cp2 : "+ cp2.getColor());
		System.out.println("Perimetre de r1: "+r1.perimeter());
		System.out.println("Perimetre de cp: "+cp.perimeter());
		System.out.println("Perimetre de cp2: "+cp2.perimeter());
		
		System.out.println("Couleurs de cp : "+ Arrays.toString(cp.getColors().toArray() ));
		System.out.println("Couleurs de cp2 : "+ Arrays.toString(cp2.getColors().toArray() ));

	}

}
