package a.withAbstractClass;

import java.util.List;

public class Square extends AbsPolygon {
	/* 
	 * Alors, la classe Square doit impl�menter (donner de corps) � la m�thode: 
	 * double area().
	 */
	public Square(){
		setSides(0);
	}

	public Square(double s){
		setSides(s);
	}
	
	public void setSides(double s){
		if (s<0) { s=0;}
		setListOfSides(List.of(s,s,s,s));
	}
	
	public double getS(){
		return listSides().get(0);
	}
		
	@Override
	public double area(){
		return listSides().get(0)*listSides().get(0);
	}
	
}
