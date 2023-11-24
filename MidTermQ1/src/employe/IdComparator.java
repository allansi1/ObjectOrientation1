package employe;

import java.util.Comparator;

public class IdComparator implements Comparator<Employe>{
	public IdComparator() {
		
	}
	public int compare(Employe e1, Employe e2) {
		int r;
		r = e1.getId()- e2.getId();
		return r;
	}

}
