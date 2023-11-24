package c.student;
import java.util.*;

public class NameComparator implements Comparator <Student>{

	public NameComparator() {
		
	}
	
	//order par name, givenName, id
	/*Override de la méthode compare de 1interface Comparator
	 * a.compare(b)< 0 ==> a est plus petit que b 
	 * a.compare(b)= 0 ==> a est égal à b 
	 * a.compare(b)> 0 ==> a est plus grand que b 
	 */
	
	@Override
	public int compare(Student s1, Student s2) {
		//D'abord on compare le nom en utilisant compareTo
		int r=s1.getName().compareTo(s2.getName());
		//Si les noms sont egaux, on compare les prenoms(givenName) en utilisant compatoTo
		if(r==0) {
			r=s1.getGivenName().compareTo(s2.getGivenName());
		}
		//si les prénoms sont égaux, on compare les ids
		if(r==0) {
			r=s1.getId()-s2.getId();
		}
		return r;
		
	}
	
}
