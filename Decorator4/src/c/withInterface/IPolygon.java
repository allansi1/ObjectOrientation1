package c.withInterface;

import java.util.*;

public interface IPolygon {
	
		public abstract List<Double> listSides();
		/*
		 * public --> tout les autres codes peuvent appeler cette m�thode.
		 * abstract -->  cette m�thode a seulement l'en-t�te. Le corps sera d�fini 
		 *               plus tard dans les classes qui impl�mentent cette interface.
		 * List<Double> --> le type du r�sultat de cette m�thode.  
		 * listSides  --> le nom de cette m�tode
		 * () --> list de param�tres de cette m�thode. Dans ce cas, il n'y a pas de param�tres
		 */
	 
		public default String stringOfSides(){
			return(Arrays.toString(this.listSides().toArray()));
		}
		
		public default double perimeter() {
			
			double p=0; 
			
			/* 
			 * Premi�re fa�on d'additionner tous le c�t�s
			 * Iteration simples avec  la boucle "for"
			 */
			List<Double> listOfSides = listSides();
			for(int i=0; i<listOfSides.size(); i++) {
				p=p+listOfSides.get(i);
			}						
			
			/* 
			 * Deuxi�me fa�on d'additionner tous le c�t�s
			 * En utilisant un iterateur: ListIterator
			 */
//			ListIterator<Double> sides = listSides().listIterator();
//			while(sides.hasNext()) {
//				p=p+sides.next();
//			}
						
			return p;
		};
		
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
