package b.withAbstractClass;

import java.util.*;

public abstract class AbsPolygon {

	public abstract List<Double> listSides();
	/*
	 * public --> tout les autres codes peuvent appeler cette m�thode.
	 * abstract -->  cette m�thode a seulement l'en-t�te. Le corps sera d�fini 
	 *               plus tard dans les classes d�riv�es.
	 * List<Double> --> le type du r�sultat de cette m�thode.  
	 * listSides  --> le nom de cette m�tode
	 * () --> list de param�tres de cette m�thode. Dans ce cas, il n'y a pas de param�tres
	 */
 
	@Override
	public final String toString(){
		return(Arrays.toString(this.listSides().toArray()));
	}
	
	public final double perimeter() {
		/* 
		 *  final --> Les classes deriv�es (enfants) ne peuvent pas faire an "override" de 
		 *  cette m�thode.
		 */
		double p=0; 
		
		/* 
		 * Premi�re fa�on d'additionner tous le c�t�s
		 * Iteration simples avec  la boucle "for"
		 */
		List<Double> ls = this.listSides();
		for(int i=0; i<ls.size(); i++) {
			p=p+ls.get(i);
		}						
		
		/* 
		 * Deuxi�me fa�on d'additionner tous le c�t�s
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
	 * public --> tout les autres codes peuvent appeler cette m�thode.
	 * abstract -->  cette m�thode a seulement l'en-t�te. Le corps sera d�fini 
	 *               plus tard dans les classe d�riv�es.
	 * double --> le type du r�sultat de cette m�thode.  
	 * area  --> le nom de cette m�tode
	 * () --> list de param�tres de cette m�thode. Dans ce cas, il n'y a pas de param�tres
	 */
	
}
