package main;

import b.liskovViolation.*;

public class Main_b {
	
	/*
	 * Quand on duplique le côté vertical (c2) d'un rectangle,
	 * l'aire du rectangle doit dupliquer aussi.
	 * La méthode myF(r) vérifie cette propriété.
	 */
	public static String myF(Rectangle r)
	{
		int aire = r.surface();
		r.setCote(r.getc1(), 2*r.getc2());
		if (r.surface()==2*aire) {
			return "OK";
		}
		else {
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5,7);
		System.out.println("r1 = "+r1);
		System.out.println("r1 is "+ myF(r1));
		System.out.println("r1 = "+r1);
		
		Rectangle r2 = new Rectangle(7,7);
		System.out.println("r2 = "+r2);
		System.out.println("r2 is "+ myF(r2));
		System.out.println("r2 = "+r2);
		
		Carre c = new Carre(5);
		System.out.println("c = "+c);
		/*
		 * Étant donnée que la classe Carré a été définie comme 
		 * dérivée de la classe Rectangle, on peut appeler la méthode 
		 * myF pour c. 
		 * 
		 * Mais quand on essaie de dupliquer le côté vertical (c2) d'un carré,
		 * la méthode setcote() définie pour carré ne va pas permetre dupliquer 
		 * seulement un côtê.  Alors le carré ne changera pas.
		 * La méthode myF(r) va jeter une exception.
		 * 
		 * Alors, on voit que faire la classe Carre dérivée de 
		 * la classe Retangle, dans le cas où on peut change les côtés
		 * après la création, donne comme résultat un héritage qui viole 
		 * le Principe de Liskov.
		 */
		System.out.println("c is "+ myF(c));  
		System.out.println("c = "+c);;
	}
}
