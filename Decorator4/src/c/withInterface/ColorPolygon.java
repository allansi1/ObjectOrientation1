package c.withInterface;

import java.util.*;

public class ColorPolygon implements IPolygon {
	/* 
	 * ColorPoligon est un décorateur de l'interface IPolygon.
	 * 
	 * Il permet d'ajouter de couleur à tous les polygones concrets qui implément
	 * l'interface IPolygon, sans avoir besoin de définir une classe 
	 * concrète derivée, (par exemple, ColorSquare, ...)  de chaque classe 
	 * concrète. 
	 * 
	 * Typiquement, un decorateur ajoute des nouveaux attributs et des nouvelles méthodes 
	 * à des classes. Il est une classe qui implémente l'interface: 
	 *  
	 *  class ColorPolygon implements IPolygon
	 *  
	 *  et il a aussi une aggregation par rapport à l'interface.
	 */
	
	IPolygon  p ;   // aggregation par rapport à l'interface IPoligon
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
		 * Nous pouvons utiliser un polygone déjà coloré (ColorPolygon) comme base pour 
		 * créer  un autre polygone coloré (ColorPolygon). 
		 * 
		 * Dans ce cas, il y aura plusieurs "nivaux" de couleurs. 
		 * La fonction getColors() sert à montrer tous ces couleurs. 
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
