package b.withAbstractClass;

import java.util.*;

public class ColorPolygon extends AbsPolygon {
	/* 
	 * ColorPoligon est un décorateur de la classe abstraite AbsPolygon.
	 * 
	 * Il permet d'ajouter de couleur à tous les polygones concrets derivés de 
	 * la classe abstraite AbsPolygon, sans avoir besoin de définir une classe 
	 * concrète derivée, (par exemple, ColorRectangle, ...)  de chaque classe 
	 * concrète. 
	 * 
	 * Typiquement, un decorateur ajoute des nouveaux attributs et nouvelles méthodes 
	 * à des classes. Il est une classe derivée de la classe base: 
	 *  
	 *  class ColorPolygon extends AbsPolygon
	 *  
	 *  et il a aussi une aggregation par rapport à la classe base.
	 */
	
	private AbsPolygon  p ;   // aggregation par rapport à la classe AbsPolygon
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
	
	/* 
	 * Alors, la classe ColorPolygon doit implémenter (donner de corps) aux méthodes: 
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
