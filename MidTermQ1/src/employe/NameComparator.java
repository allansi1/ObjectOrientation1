package employe;

import java.util.*;

public class NameComparator implements Comparator<Employe>{

	
	NameComparator(){
		
	}
	public int compare(Employe e1, Employe e2) {
		
		//comparer les noms
		int r = e1.getNom().compareTo(e2.getNom());
		if(r==0) {
		//Si les noms sont égaux, on compare les prenoms
			r = e1.getPrenom().compareTo(e2.getPrenom());
		}
		//Si les prenoms sont égaux, on compare les ids
		if(r==0) {
			r = e1.getId()- e2.getId();
		}
		return r;
		
	}

}
