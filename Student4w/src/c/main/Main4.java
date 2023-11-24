package c.main;

import java.util.*;


import c.student.Student;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "Tremblay","Pierre");
		s1.setGrade(83.5);
		list.add(s1);
		
		list.add(new Student(44,"Smith","Anne").withGrade(85.3));
		list.add(new Student(45,"Smith","Anne").withGrade(85.3));
		list.add(new Student(28,"Barros","Renan",81.4));
		list.add(null);
		list.add(new Student(17,"Picard","Jean",90.5));
		list.add(new Student(19,"Brown","Mary",88.5));
		
		System.out.println("ArrayList is by default sorted by the inclusion order");
		for(Student a : list)
			System.out.println(a);
		System.out.println();
		
		/*System.out.println("ArrayList is by default order");
		Collections.sort(list);
		for(Student a : list)
			System.out.println(a);
		System.out.println();*/
		
		/*
		 *La solution la plus simple est d'utiliser de comparator avec
		 *Comparator.nullsLast() ou Comparator.nullsFirst(). Si nous voulons
		 *l'ordre default, nous pouvons l'obtenir par le comparator dont 
		 *l'expression lambda o1,o2)->o1.compareTo(o2) et nous pouvons alors
		 *le combiner avec Comparator.nullLast() or Comparator.nullsFirst(). 
		 */
		
		System.out.println("ArrayList is by id (student default order");
		Collections.sort(list, Comparator.nullsLast((o1,o2)->o1.compareTo(o2)));
		for(Student a : list)
			System.out.println(a);
		System.out.println();
		
		

	}

}
