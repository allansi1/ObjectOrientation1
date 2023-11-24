package liskov;

import java.util.*;

public abstract class Conique {
	
	protected double sah;
	protected double sav;
		
	public double getH() {
		return this.sah;
	}
	
	public double getV() {
		return this.sav;
	}
	
	
	public final double Aire() {
		return Math.PI*this.sah*this.sav;
	}
	
	public List<Double> getAttributs(){
		List<Double> list = new ArrayList<Double>();
		list.add(getH());
		list.add(getV());
		
		return list;
		
	}
	
	@Override 
	public String toString() {
		return getAttributs().toString();
	}

}
