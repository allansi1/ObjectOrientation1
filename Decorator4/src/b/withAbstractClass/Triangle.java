package b.withAbstractClass;

import java.util.*;

public class Triangle extends AbsPolygon {
	/* 
	 * Alors, la classe Triangle doit implémenter (donner de corps) aux méthodes: 
	 * double area()  et  List<Double> listSides()
	 */
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(){
		setSides(0, 0, 0);
	}

	public Triangle(double s1 , double s2, double s3){
		setSides(s1, s2, s3);
	}
	
	public void setSides(double s1, double s2, double s3){
		if (s1<0) { this.s1=0; }
		else { this.s1 =s1; }
		if (s2<0) { this.s2=0; }
		else { this.s2 =s2; }
		if (s3<0) { this.s3=0; }
		else { this.s3 =s3; }	  
	}
	
	public double getS1(){
		return s1;
	}
	public double getS2(){
		return s2;
	}
	public double getS3(){
		return s3;
	}
	
	@Override
	public double area(){
		double s = this.perimeter() / 2;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)) ;
	}
	
	@Override
	public List<Double> listSides(){
		List<Double> l = new ArrayList<Double>();
		l.add(this.s1);
		l.add(this.s2);
		l.add(this.s3);
		return l;
	}
}
