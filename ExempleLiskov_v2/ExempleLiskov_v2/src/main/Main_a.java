package main;

import a.liskovImm.*;

public class Main_a {

	public static void main(String[] args) {
		
		/* 
		 * L'héritage entre CarreImm e RectagleImm respecte 
		 * le principle de Liskov.  On n'a pas de problèmes.
		 * */
		
		RectangleImm r = new RectangleImm(3,5);
		System.out.println("Retangle r: "+r);
		System.out.println("Côté 1 du rectangle r: "+ r.getc1());
		System.out.println("Côté 2 du rectangle r: "+ r.getc2());
		System.out.println("Périmètre du rectangle r: "+ r.perimetre());
		System.out.println("Aire du rectangle r: "+ r.surface());
				
		CarreImm c = new CarreImm(3);
		System.out.println("Carré c: "+ c);
		System.out.println("Côté 1 du carré c: "+ c.getc1());
		System.out.println("Côté 2 du carré c: "+ c.getc2());
		System.out.println("Périmètre du carré c: "+ c.perimetre());
		System.out.println("Aire du carré c: "+ c.surface());
		
		RectangleImm d = new CarreImm(3);
		System.out.println("Carré d: "+ d);
		System.out.println("Côté 1 du carré d: "+ d.getc1());
		System.out.println("Côté 2 du carré d: "+ d.getc2());
		System.out.println("Périmètre du carré d: "+ d.perimetre());
		System.out.println("Aire du carré d: "+ d.surface());
			
	}
}
