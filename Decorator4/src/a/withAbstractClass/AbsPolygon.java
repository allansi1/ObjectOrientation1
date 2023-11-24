package a.withAbstractClass;

import java.util.*;

public abstract class AbsPolygon {
	
	private List<Double> listOfSides;

	public List<Double> listSides() {
		/*
		 * public --> tout les autres codes peuvent appeler cette m�thode.
		 * List<Double> --> le type du r�sultat de cette m�thode.  
		 * listSides  --> le nom de cette m�tode
		 * () --> list de param�tres de cette m�thode. Dans ce cas, il n'y a pas de param�tres
		 * 
		 * Cette m�thode ne doit pas �tre final pour que les d�corateurs puissent la 
		 * red�finir (Override).
		 */
		return listOfSides; 
	}
		
	protected final void setListOfSides (List<Double> list) {
		listOfSides=list;
	}
	
	/*
	 * Les m�thodes concr�tes doivent utiliser la m�thode listSides() et pas 
	 * l'attrubut listOfSides pour qu'elles marchent correctement avec les 
	 * d�corateurs. 
	 */
	
	@Override
	public final String toString(){
		/* 
		 *  final --> Les classes deriv�es (enfants) ne peuvent pas faire an "override" de 
		 *  cette m�thode.
		 */
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
		List<Double> ls= this.listSides();
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
