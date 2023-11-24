package c.student;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student>{
	
	// order par grade, id
	/* Override de la m�thode compare de l'interface Comparator
	 * Attention:  
	 *        a.compare(b) < 0  ==>  a est "plus petit" que b 
	 *        a.compare(b) = 0  ==>  a est �gal � b 
	 *        a.compare(b) > 0  ==>  a est "plus grand" que b
	 *  */
	@Override
	public int compare(Student s1, Student s2) {
		int r;
		if (s1.getGrade()>s2.getGrade()) {
			r=1;
		}
		else if (s1.getGrade()==s2.getGrade()) {
			r=0;
		}
		else { // s1.getGrade()<s2.getGrade()
			r=-1;
		}
		/* 
		 * Si les notes sont egales, il nous reste que comparer par l'id
		 * */
		if (r==0) {
			r=s1.getId()-s2.getId();
		}
		return r;
	}

}
