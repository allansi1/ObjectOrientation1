package c.student;

import java.util.Comparator;

public class NameComparator  implements Comparator<Student> {
	
	// Le constructeur default. Pas besoin de le coder explicitement
	//public NameComparator() {
	//}
	
	// order par name, givenName, id
	/* Override de la méthode compare de l'interface Comparator
	 * Attention:  
	 *        a.compare(b) < 0  ==>  a est "plus petit" que b 
	 *        a.compare(b) = 0  ==>  a est égal à b 
	 *        a.compare(b) > 0  ==>  a est "plus grand" que b
	 *  */
	@Override
	public int compare(Student s1, Student s2) {
		/* 
		 * D'abord, on compare les noms (name) en utilisant le compareTo de String 
		 * */
		int r= s1.getName().compareTo(s2.getName());
		/* 
		 * Si les noms sont egaux, on compare les prénoms (givenName) en utilisant 
		 * le compareTo de String 
		 * */
		if (r==0) { r= s1.getGivenName().compareTo(s2.getGivenName());}
		/* 
		 * Si les prénoms sont aussi egaux, il nous reste que comparer par l'id
		 * */
		if (r==0) {r=s1.getId()-s2.getId();}
		return r;
	}

}
