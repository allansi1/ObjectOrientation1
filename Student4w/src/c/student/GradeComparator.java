package c.student;

import java.util.*;

public class GradeComparator implements Comparator <Student>{
	
	//order par grade, id
		/*Override de la méthode compare de 1interface Comparator
		 * a.compare(b)< 0 ==> a est plus petit que b 
		 * a.compare(b)= 0 ==> a est égal à b 
		 * a.compare(b)> 0 ==> a est plus grand que b 
		 */
	@Override
	public int compare(Student s1, Student s2) {
		int r;
		if(s1.getGrade()>s2.getGrade()) {
			r=1;
		}
		else if(s1.getGrade()==s2.getGrade()) {
			r=0;
		}
		else { //(s1.getGrade()<s2.getGrade())
			r=-1;
		}
		//si les notes sont egales, il nous reste de comparer les id
		if(r==0) {
			r=s1.getId()-s2.getId();
		}
		return r;
	}
	
		

}
