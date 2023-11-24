package a.withAbstractClass;

import java.util.List;

public class Triangle extends AbsPolygon {
	/* 
	 * Alors, la classe Triangle doit implémenter (donner de corps) à la méthode: 
	 * double area().
	 */
	public Triangle(){
		setSides(0, 0, 0);
	}

	public Triangle(double s1 , double s2, double s3){
		setSides(s1, s2, s3);
	}
	
	public void setSides(double s1, double s2, double s3){
		if (s1<0) { s1=0; }
		if (s2<0) { s2=0; }
		if (s3<0) { s3=0; }
		setListOfSides(List.of(s1,s2,s3));
	}
	
	public double getS1(){
		return listSides().get(0);
	}
	public double getS2(){
		return listSides().get(1);
	}
	public double getS3(){
		return listSides().get(2);
	}
	
	@Override
	public double area(){
		double s = this.perimeter() / 2;
		double a = this.getS1();
		double b = this.getS2();
		double c = this.getS3();
		return Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
	}
}
