package g.mySort;

import java.util.*;

public class MySort {
	
	/* 
	 * Trier par l'ordre défaut, en utilisant compareTo de l'interface Comparable 
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
	 * Si l'objet comparator fourni est null, remplacez-le par un comparateur basé sur
	 * compareTo de l'interface Comparable. 
	 * */
	public static <T> void sort(List<T> l, Comparator<T> c ) {	
		if (c==null) { 	
			c=(o1,o2)-> ((Comparable<T>) o1).compareTo(o2);
		}
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
	
	/* la méthode reverseOrder por inverser soit l'ordre default, 
	 * soit un ordre défini par un objet du type Comparator
	 */
	
	/* Définitions compactes utilisant des fonctions lambda */ 
	
	public static <T> Comparator<T> reverseOrder(){
		return 
			(o1,o2)-> -1*(((Comparable<T>)o1).compareTo(o2));
	}
	
	public static <T> Comparator<T> reverseOrder(Comparator<T> c) {
		if (c==null) {
			return
				(o1,o2)-> -1*( ((Comparable<T>) o1).compareTo(o2) );
		}
		else {
			return 
				(o1,o2)-> -1 * (c.compare(o1, o2));
		}
	}
	
	/* Définitions compactes */ 
	
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
//		if (c==null) {
//			return new Comparator<T>() {
//				@Override
//				public int compare(T o1, T o2) {
//					return -1*( ((Comparable<T>) o1).compareTo(o2)  );
//				}
//		   };
//		}
//		else {
//			return new Comparator<T>() {
//				@Override
//				public int compare(T o1, T o2) {
//					return -1 * (c.compare(o1, o2));
//				}
//			};
//		}
//	}
	
	/* Définitions étendues */ 
	
//	private static class reverseDefault<T> implements Comparator<T> {
//		@Override
//		public int compare (T o1, T o2) {
//			return -1*(((Comparable<T>)o1).compareTo(o2));
//		}
//	}
//	
//	public static <T> Comparator<T> reverseOrder(){
//		return new reverseDefault<T>();
//	}
//	
//
//	private static class reverseComparator<T> implements Comparator<T> {
//		 private Comparator<T> c;
//		 private reverseComparator(Comparator<T> c) {
//			if (c==null) {
//				this.c=new Comparator<T>() {
//								@Override
//								public int compare(T o1, T o2) {
//									return ( ((Comparable<T>) o1).compareTo(o2)  );
//								}
//						   };
//			}
//			else {
//				this.c = c;
//			}	 
//		 }
//		
//		@Override
//		public int compare (T o1, T o2) {
//			return -1*(this.c.compare(o1, o2));
//		}
//	}
//	
//	public static <T> Comparator<T> reverseOrder(Comparator<T> c){
//		return new reverseComparator<T>(c);
//	}

}
