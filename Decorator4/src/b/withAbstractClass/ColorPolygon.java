package b.withAbstractClass;

import java.util.*;

public class ColorPolygon extends AbsPolygon {
	/* 
	 * ColorPoligon est un d�corateur de la classe abstraite AbsPolygon.
	 * 
	 * Il permet d'ajouter de couleur � tous les polygones concrets deriv�s de 
	 * la classe abstraite AbsPolygon, sans avoir besoin de d�finir une classe 
	 * concr�te deriv�e, (par exemple, ColorRectangle, ...)  de chaque classe 
	 * concr�te. 
	 * 
	 * Typiquement, un decorateur ajoute des nouveaux attributs et nouvelles m�thodes 
	 * � des classes. Il est une classe deriv�e de la classe base: 
	 *  
	 *  class ColorPolygon extends AbsPolygon
	 *  
	 *  et il a aussi une aggregation par rapport � la classe base.
	 */
	
	private AbsPolygon  p ;   // aggregation par rapport � la classe AbsPolygon
	private Colors c;
	
	public ColorPolygon(AbsPolygon p) {
		this.p=p;
		c=Colors.DEFAULT;
	}
	
	public ColorPolygon(AbsPolygon p, Colors c) {
		this.p=p;
		this.c=c;
	}
	
	public Colors getColor() {
		return this.c;
	}

	public void setColor(Colors c ) {
		this.c=c;
	} 
	
	public List<Colors> getColors() {
		/* 
		 * Nous pouvons utiliser un polygone d�j� color� (ColorPolygon) comme base pour 
		 * cr�er  un autre polygone color� (ColorPolygon). 
		 * 
		 * Dans ce cas, il y aura plusieurs "nivaux" de couleurs. 
		 * La fonction getColors() sert � montrer tous ces couleurs. 
		 * 
		 */
		List<Colors> lc = new ArrayList<Colors>();
		lc.add(this.c);
		try { 
		  lc.addAll(((ColorPolygon)p).getColors());
		}
		catch(Exception e){}
		return lc;
	}
	
	/* 
	 * Alors, la classe ColorPolygon doit impl�menter (donner de corps) aux m�thodes: 
	 * double area()  et  List<Double> listSides()
	 */
	@Override
	public double area(){
		return this.p.area();
	}
	
	@Override
	public List<Double> listSides(){
		return this.p.listSides();
	}
}
