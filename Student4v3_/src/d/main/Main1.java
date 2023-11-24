package d.main;

import b.student.*;

public class Main1 {

	private static void treatException(StudentDataException e) {
		e.printStackTrace();                  // imprime la pile de "trace"
		if (e.getCode()==1) {
			System.err.println( "S'il vous pla�t, l'id doit �tre positif.");    // System.err  -- imprime en rouge, message d'erreur
		}
		else if (e.getCode()==2) {
			System.err.println("D�sol�, mais "+ (String) e.getObj() +" n'est pas un nom valide.");
		}
		else if (e.getCode()==3) {
			System.out.println("D�sol�, mais "+ (String) e.getObj() +" n'est pas un pr�nom valide.");
		}
		else if (e.getCode()==4) {
			System.out.println("D�sol�, mais "+ (double) e.getObj() +" n'est pas une note valide");
		}
		else {
			System.out.println("Erreur inconnu");
		}		
	}
	
	public static void main(String[] args) {
				
		System.out.println(new Student(3, "Tremblay", "Jean"));      // par d�faut, la note est 0.
		
		Student s1 = new Student(1, "Tremblay", "Pierre");
//		System.out.println(s1.setGrade(85.3));  // �a ne marche pas, parce que setGrade ne retourne rien.
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
