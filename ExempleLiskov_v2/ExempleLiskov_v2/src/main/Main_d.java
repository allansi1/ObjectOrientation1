package main;

import d.liskovSolInterf.*;

public class Main_d {

	/*
	 * Quand on duplique le côté vertical (c2) d'un rectangle,
	 * l'aire du rectangle doit dupliquer aussi.
	 * La méthode myF(r) vérifie cette propriété, mais elle 
	 * est spécifique pour la classe Rectangle 
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
	 * On peut penser à définir une méthode comme myF pour 
	 * la interface IFormeRectangulaire, mais il n'y a pas de 
	 * méthode setCote (ni default ni abstracte) definie 
	 * pour cette interface. 
	 * 
	 * La mutabilité n'existe pas au niveaux de l'interface
	 * IFormeRectangulaire, elle existe seulement
	 * au niveaux des classes concrètes Rectangle et Carre.
	 * 
	 * Le principe de Liskov est respecté. 
	 * */
	
	public static String myF2(IFormeRectangulaire r)
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
		 * Étant donnée que la classe Carré n'est pas définie comme 
		 * dérivée de la classe Rectangle, on ne peut pas appeler la méthode 
		 * myF pour c.
		 */
		//System.out.println("c is "+ myF(c));  
		System.out.println("c = "+c);
	}
}
