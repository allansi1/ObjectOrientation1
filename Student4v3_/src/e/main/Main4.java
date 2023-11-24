package e.main;

import java.util.*;

import c.student.*;


public class Main4 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Tremblay", "Pierre");
//		list.add(s1.setGrade(85.3));  // ça ne marche pas, parce que setGrade ne retourne rien.
		s1.setGrade(83.5);
		list.add(s1);
		
		list.add(new Student(44, "Smith", "Anne").withGrade(85.3));
		list.add(new Student(45, "Smith", "Anne").withGrade(85.3));
		list.add(new Student(28, "Barros", "Renan", 81.4));
		list.add(null);
		list.add(new Student(17, "Picard","Jean", 90.5));
		list.add(new Student(19, "Brown","Mary", 88.5));
		
		System.out.println("ArrayList is by default sorted by the inclusion order");
		for(Student a: list)
			System.out.println(a);
		System.out.println();
		
		/*
		 * Si la list (la collection) contient des éléments null,
		 * nous ne pouvons pas la trier par l'ordre default.
		 * Cela produirait aussi "NullPointerException".
		 * */
//		System.out.println("ArrayList sorted by id  (Student default order)");
//		Collections.sort(list);   
//		for(Student a: list)
//			System.out.println(a);
//		System.out.println();
		
//		System.out.println("ArrayList sorted by id  (Student default order - reversed)");
//		Collections.sort(list, Collections.reverseOrder());   
//		for(Student a: list)
//			System.out.println(a);
//		System.out.println();
		
		/*
		 * Si la list (la collection) contient des éléments null
		 * et le comparator ne traite pas la condition des éléments null, 
		 * nous ne pouvons pas la trier par ce comparator.
		 * Cela produirait aussi une "NullPointerException".
		 * */
//		System.out.println("ArrayList sorted by name");
//		Collections.sort(list, new NameComparator()); 
//		for(Student a: list)
//			System.out.println (a);
//		System.out.println();
		
		/*
		 * La solution la plus simple est d'utiliser de comparator 
		 * avec Comparator.nullsLast()  or Comparator.nullsFirst().
		 * Si nous voulons l'ordre default, nous pouvons l'obtenir 
		 * par le comparator dont l'expression lambda est  
		 * (o1,o2)->o1.compareTo(o2)
		 * et nous pouvons alors le combiner avec 
		 * Comparator.nullsLast()  or Comparator.nullsFirst().
		 * */
		
		System.out.println("ArrayList sorted by id  (Student default order)");
		Collections.sort(list, Comparator.nullsLast((o1,o2)->o1.compareTo(o2)));   
		for(Student a: list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList sorted by id  (Student default order - reversed)");
		Collections.sort(list, 
				Collections.reverseOrder(Comparator.nullsLast((o1,o2)->o1.compareTo(o2))));   
		for(Student a: list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList sorted by name");
		Collections.sort(list, Comparator.nullsLast(new NameComparator())); 
		for(Student a: list)
			System.out.println (a);
		System.out.println();
		
		System.out.println("ArrayList sorted by name (comparator internal class)");
		Collections.sort(list, Comparator.nullsLast(new Student.NameComparator2())); 
		for(Student a: list)
			System.out.println (a);
		System.out.println();
		
		System.out.println("ArrayList sorted by grade");
		Collections.sort(list, Comparator.nullsLast(new GradeComparator())); 
		for(Student a: list)
			System.out.println (a);
		System.out.println();
		
		System.out.println("ArrayList sorted by grade (reverse order)");
		Collections.sort(list, 
				Collections.reverseOrder(Comparator.nullsLast(new GradeComparator()))); 
		for(Student a: list)
			System.out.println (a);
		System.out.println();
		
	}

}
