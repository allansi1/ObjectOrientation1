package main;

import c.liskovSolAbsCl.*;

public class Main_c {
	
	/*
	 * Quand on duplique le c�t� vertical (c2) d'un rectangle,
	 * l'aire du rectangle doit dupliquer aussi.
	 * La m�thode myF(r) v�rifie cette propri�t�, mais elle 
	 * est sp�cifique pour la classe Rectangle 
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
	
	/*
	 * On peut penser � d�finir une m�thode comme myF pour 
	 * la classe FormeRectangulaire, mais il n'y a pas de 
	 * m�thode setCote (ni concr�te ni abstracte) definie 
	 * pour cette classe. 
	 * 
	 * La mutabilit� n'existe pas au niveau de la classe
	 * abstraite FormeRectangulaire, elle existe seulement
	 * au niveau des classes concr�tes Rectangle et Carre.
	 * 
	 * Le principe de Liskov est respect�. 
	 * */
	
	public static String myF2(FormeRectangulaire r)
	{
		int aire = r.surface();
		//r.setCote(r.getc1(), 2*r.getc2());
//		if (r.surface()==2*aire) {
			return "OK";
//		}
//		else {
//			throw new RuntimeException();
//		}
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
		 * �tant donn�e que la classe Carr� n'est pas d�finie comme 
		 * d�riv�e de la classe Rectangle, on ne peut pas appeler la m�thode 
		 * myF pour c.
		 */
		//System.out.println("c is "+ myF(c));  
		System.out.println("c = "+c);
	}
}
