package b.main;

import java.util.*;

import b.student.*;

public class Main2 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Tremblay", "Pierre");
//		list.add(s1.setGrade(85.3));  // �a ne marche pas, parce que setGrade ne retourne rien.
		s1.setGrade(83.5);
		list.add(s1);
		
		list.add(new Student(44, "Smith", "Anne").withGrade(85.3));
		list.add(new Student(45, "Smith", "Anne").withGrade(85.3));
		list.add(new Student(28, "Barros", "Renan", 81.4));
		list.add(new Student(17, "Picard","Jean", 90.5));
		list.add(new Student(19, "Brown","Mary", 88.5));
		
		System.out.println("ArrayList is by default sorted by the inclusion order");
		for(Student a: list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList sorted by id  (Student default order)");
		Collections.sort(list);   
		for(Student a: list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList sorted by id  (Student default order - reversed)");
		Collections.sort(list, Collections.reverseOrder());   
		for(Student a: list)
			System.out.println(a);
		System.out.println();
		
	}

}
