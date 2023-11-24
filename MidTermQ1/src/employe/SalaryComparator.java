package employe;

import java.util.*;

public class SalaryComparator implements Comparator<Employe>{ 

	SalaryComparator(){
		
	}
	
	public int compare(Employe e1, Employe e2) {
		int r;
		
		//comparer les salaires si ils sont diferentes, si sont égaux, on compare les ids
		if(e1.getSalaire()> e2.getSalaire()) {
			r=1;
		}
		else if(e1.getSalaire()==e2.getSalaire()) {
			r=0;
		}
		else  {
			r=-1;
		}
		if(r==0) {
			r=e1.getId()-e2.getId();
		}
		return r;
	}
	
}
