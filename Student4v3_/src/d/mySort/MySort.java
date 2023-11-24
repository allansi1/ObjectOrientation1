package d.mySort;

import java.util.*;

public class MySort {
	
	/* 
	 * Trier par l'ordre défaut, en utilisant compareTo de l'interface Comparable 
	 * Ce code est simple et il ne permet pas d'utiliser des comparators.
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

}
