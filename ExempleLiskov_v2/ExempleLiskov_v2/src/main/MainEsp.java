package main;

import e.liskovEsp.*;

public class MainEsp {
	
	
	/*
	 * L'aire du carré est le carré de son côté.
	 * La méthode myF(r) vérifie cette propriété.
	 */
	static String myFunction(Carre s)  {
		if (s.surface()== s.getc1()*s.getc1()) {
			return "OK";
		}
		else {
			throw new RuntimeException();
		}
		
	}

	public static void main(String[] args) {
		
		Carre c = new Carre(3);
		System.out.println("c = "+ c);
		System.out.println("c is "+ myFunction(c));
				
		Rectangle r = new Rectangle (3,4);
		/*
		 * Étant donnée que la classe Rectangle a été définie comme 
		 * dérivée de la classe Carre, on peut appeler la méthode 
		 * myF pour r. 
		 * 
		 * Mais, l'aire de r n'est pas le carré de son premier côté.
		 * 
		 * Alors, on voit que faire la classe Rectangle dérivée de 
		 * la classe Carre, même s'ils sont immuables, donne comme 
		 * résultat un héritage qui viole le Principe de Liskov.
		 */
		System.out.println("r = "+ r);
		System.out.println("r is "+ myFunction(r));

	}
}
