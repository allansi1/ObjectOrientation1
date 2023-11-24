package c.withInterface;

import java.util.*;

public class ColorPolygon implements IPolygon {
	/* 
	 * ColorPoligon est un d�corateur de l'interface IPolygon.
	 * 
	 * Il permet d'ajouter de couleur � tous les polygones concrets qui impl�ment
	 * l'interface IPolygon, sans avoir besoin de d�finir une classe 
	 * concr�te deriv�e, (par exemple, ColorSquare, ...)  de chaque classe 
	 * concr�te. 
	 * 
	 * Typiquement, un decorateur ajoute des nouveaux attributs et des nouvelles m�thodes 
	 * � des classes. Il est une classe qui impl�mente l'interface: 
	 *  
	 *  class ColorPolygon implements IPolygon
	 *  
	 *  et il a aussi une aggregation par rapport � l'interface.
	 */
	
	IPolygon  p ;   // aggregation par rapport � l'interface IPoligon
	Colors c;
	
	public ColorPolygon(IPolygon p) {
		this.p=p;
		c=Colors.DEFAULT;
	}
	
	public ColorPolygon(IPolygon p, Colors c) {
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
	
	@Override
	public double area(){
		return this.p.area();
	}
	
	@Override
	public List<Double> listSides(){
		return this.p.listSides();
	}
}
