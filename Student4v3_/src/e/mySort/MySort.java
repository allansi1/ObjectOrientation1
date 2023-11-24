package e.mySort;

import java.util.*;

public class MySort {
	
	/* 
	 * Trier par l'ordre d�faut, en utilisant compareTo de l'interface Comparable 
	 * */
	public static <T> void sort(List<T> l) {	
		int i;
		for(i=0; i<l.size();i++) {
			for(int j=i+1; j<l.size();j++ ) {	
				if ( ((Comparable<T>) l.get(i)).compareTo((l.get(j)) )>0 ) {
					T temp = l.get(j);
					l.set(j, l.get(i));
					l.set(i, temp);  				
				}
			}
		}	
	}
	
	/* 
	 * Trier par un ordre additionel , en utilisant compare de l'interface Comparator 
	 * Attention: Ce code de "sort(List<T> l, Comparator<T> c )" est le plus basique,
	 * il ne traite pas le cas o� c est null. Alors, si c re�oit null, nous aurons 
	 * une exception de "NullPointerException". 
	 * */
	public static <T> void sort(List<T> l, Comparator<T> c ) {	
		int i;
		for(i=0; i<l.size();i++) {
			for(int j=i+1; j<l.size();j++ ) {	
				if ( c.compare(l.get(i), l.get(j )) >0 ) {
					T temp = l.get(j);
					l.set(j, l.get(i));
					l.set(i, temp);  				
				}
			}
		}	
	}
	
	/* la m�thode reverseOrder por inverser soit l'ordre default, 
	 * soit un ordre d�fini par un objet du type Comparator
	 */
	
	/* D�finitions compactes */ 
	
//	public static <T> Comparator<T> reverseOrder(){
//		return new Comparator<T>() {
//			@Override
//			public int compare (T o1, T o2) {
//				return -1*(((Comparable<T>)o1).compareTo(o2));
//			}
//		};
//	}
//	
//	public static <T> Comparator<T> reverseOrder(Comparator<T> c) {
//		return new Comparator<T>() {
//			@Override
//			public int compare(T o1, T o2) {
//				return -1 * (c.compare(o1, o2));
//			}
//		};
//	}
	
	/* D�finitions �tendues */ 
	
	private static class reverseDefault<T> implements Comparator<T> {
		@Override
		public int compare (T o1, T o2) {
			return -1*(((Comparable<T>)o1).compareTo(o2));
		}
	}
	
	public static <T> Comparator<T> reverseOrder(){
		return new reverseDefault<T>();
	}
	

	private static class reverseComparator<T> implements Comparator<T> {
		 private Comparator<T> c;
		 private reverseComparator(Comparator<T> c) {
			 this.c=c;		 
		 }
		
		@Override
		public int compare (T o1, T o2) {
			return -1*(this.c.compare(o1, o2));
		}
	}
	
	public static <T> Comparator<T> reverseOrder(Comparator<T> c){
		return new reverseComparator<T>(c);
	}

}
