package d.main;

import b.student.*;

public class Main1 {

	private static void treatException(StudentDataException e) {
		e.printStackTrace();                  // imprime la pile de "trace"
		if (e.getCode()==1) {
			System.err.println( "S'il vous plaît, l'id doit être positif.");    // System.err  -- imprime en rouge, message d'erreur
		}
		else if (e.getCode()==2) {
			System.err.println("Désolé, mais "+ (String) e.getObj() +" n'est pas un nom valide.");
		}
		else if (e.getCode()==3) {
			System.out.println("Désolé, mais "+ (String) e.getObj() +" n'est pas un prénom valide.");
		}
		else if (e.getCode()==4) {
			System.out.println("Désolé, mais "+ (double) e.getObj() +" n'est pas une note valide");
		}
		else {
			System.out.println("Erreur inconnu");
		}		
	}
	
	public static void main(String[] args) {
				
		System.out.println(new Student(3, "Tremblay", "Jean"));      // par défaut, la note est 0.
		
		Student s1 = new Student(1, "Tremblay", "Pierre");
//		System.out.println(s1.setGrade(85.3));  // ça ne marche pas, parce que setGrade ne retourne rien.
		s1.setGrade(83.5);		
		System.out.println(s1);
		
		System.out.println(new Student(44, "Smith", "Anne").withGrade(85.3));
		
		System.out.println(new Student(19, "Brown", "Mary", 88.5));
		
		try {
			System.out.println(new Student ( -100, "Picard", "Jean-Luc"));
		}
		catch(StudentDataException e) {
			treatException(e);
		}
		
		try {
			System.out.println(new Student ( 100, "Picard2", "Jean-Luc", 100));
		}
		catch(StudentDataException e) {
			treatException(e);
		}
		
		try {
			System.out.println(new Student ( 100, "Picard", "Jean+Luc", 100));
		}
		catch(StudentDataException e) {
			treatException(e);
		}
		
		try {
			System.out.println(new Student ( 100, "Picard", "Jean-Luc", -20));
		}
		catch(StudentDataException e) {
			treatException(e);
		}

	}

}
