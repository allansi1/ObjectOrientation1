package b.withAbstractClass;

import java.util.*;

public abstract class AbsPolygon {

	public abstract List<Double> listSides();
	/*
	 * public --> tout les autres codes peuvent appeler cette méthode.
	 * abstract -->  cette méthode a seulement l'en-tête. Le corps sera défini 
	 *               plus tard dans les classes dérivées.
	 * List<Double> --> le type du résultat de cette méthode.  
	 * listSides  --> le nom de cette métode
	 * () --> list de paramètres de cette méthode. Dans ce cas, il n'y a pas de paramètres
	 */
 
	@Override
	public final String toString(){
		return(Arrays.toString(this.listSides().toArray()));
	}
	
	public final double perimeter() {
		/* 
		 *  final --> Les classes derivées (enfants) ne peuvent pas faire an "override" de 
		 *  cette méthode.
		 */
		double p=0; 
		
		/* 
		 * Première façon d'additionner tous le côtés
		 * Iteration simples avec  la boucle "for"
		 */
		List<Double> ls = this.listSides();
		for(int i=0; i<ls.size(); i++) {
			p=p+ls.get(i);
		}						
		
		/* 
		 * Deuxième façon d'additionner tous le côtés
		 * En utilisant un iterateur: ListIterator
		 */
//		ListIterator<Double> sides = listSides().listIterator();
//		while(sides.hasNext()) {
//			p=p+sides.next();
//		}
					
		return p;
	}
	
	public abstract double area();	
	/*
	 * public --> tout les autres codes peuvent appeler cette méthode.
	 * abstract -->  cette méthode a seulement l'en-tête. Le corps sera défini 
	 *               plus tard dans les classe dérivées.
	 * double --> le type du résultat de cette méthode.  
	 * area  --> le nom de cette métode
	 * () --> list de paramètres de cette méthode. Dans ce cas, il n'y a pas de paramètres
	 */
	
}
