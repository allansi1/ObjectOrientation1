package a.withAbstractClass;

import java.util.*;

public abstract class AbsPolygon {
	
	private List<Double> listOfSides;

	public List<Double> listSides() {
		/*
		 * public --> tout les autres codes peuvent appeler cette méthode.
		 * List<Double> --> le type du résultat de cette méthode.  
		 * listSides  --> le nom de cette métode
		 * () --> list de paramètres de cette méthode. Dans ce cas, il n'y a pas de paramètres
		 * 
		 * Cette méthode ne doit pas être final pour que les décorateurs puissent la 
		 * redéfinir (Override).
		 */
		return listOfSides; 
	}
		
	protected final void setListOfSides (List<Double> list) {
		listOfSides=list;
	}
	
	/*
	 * Les méthodes concrètes doivent utiliser la méthode listSides() et pas 
	 * l'attrubut listOfSides pour qu'elles marchent correctement avec les 
	 * décorateurs. 
	 */
	
	@Override
	public final String toString(){
		/* 
		 *  final --> Les classes derivées (enfants) ne peuvent pas faire an "override" de 
		 *  cette méthode.
		 */
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
		List<Double> ls= this.listSides();
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
