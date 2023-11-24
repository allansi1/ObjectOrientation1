package main;

import pack.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("E01", "Allan");
		Student s2 = new Student("E02", "Fulano");
		Student s3 = new Student("E03", "Beltrano");
		
		Program p1 = new Program("P01", "Informatique");
		Program p2 = new Program("P02", "Design");
		
		s1.Inscription(p1);
		s2.Inscription(p2);
		s2.Inscription(p1);
		
		//Navigation de programme vers Student
		System.out.println(s1.getName() + " is subscribed in " + s1.getProg().getName());
		System.out.println(s1.getName() + " is subscribed in " + s2.getProg().getName());
		//Navigation de Student vers program
		System.out.println("Program p1 " + p1.getName());
		for(Student s : p1.getLS()) {
			System.out.println(" " + s.getName());
		}
		

	}

}
