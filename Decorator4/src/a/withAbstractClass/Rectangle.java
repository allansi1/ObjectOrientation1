package a.withAbstractClass;

import java.util.*;

public class Rectangle extends AbsPolygon {
	/* 
	 * Alors, la classe Rectangle doit implémenter (donner de corps) à la méthode: 
	 * double area().
	 */
	public Rectangle(){
		setSides(0, 0);
	}

	public Rectangle(double sh , double sv){
		setSides(sh, sv);
	}
	
	public void setSides(double sh , double sv){
		if (sh<0) { sh=0;}
		if (sv<0) { sv=0; }
		setListOfSides(List.of(sh,sv,sh,sv));	
	}
	
	public double getSh(){
		return listSides().get(0);
	}
	public double getSv(){
		return listSides().get(1);
	}
	
	@Override
	public double area(){
		return listSides().get(0)*listSides().get(1);
	}
	
}
