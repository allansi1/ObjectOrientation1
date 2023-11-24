package b.main;
import b.student.*;

public class Main1 {
	
	private static void treatException(StudentDataException e) {
		e.printStackTrace();
		if (e.getCode()==1) {
			System.err.print("S'il vous plait, l'id doit être positif.\n");
			
		}
		else if (e.getCode()==2) {
			System.err.print("Désolé, mais " +(String) e.getObj()+ " n'est pas un nom valide.\n");
			
		}
		else if (e.getCode()==3) {
			System.err.print("Désolé, mais " +(String) e.getObj()+ " n'est pas un prénom valide.\n");
			
		}
		else if (e.getCode()==4) {
			System.err.print("Désolé, mais " +(double) e.getObj()+ " n'est pas une note valide.\n");
			
		}
		else {
			System.out.println("Erreur inconnu\n");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Student(3, "Tremblay","Jean"));//par défaut la note est 0.
		
		Student s1 = new Student(1, "Tremblay", "Jean");
		//System.out.println(s1.setGrade(88)); setGrade est un void, ne retour rien
		s1.setGrade(83.5);
		System.out.println(s1);
		System.out.println(new Student(44, "Smith","Anne").withGrade(85.3));
		
		System.out.println(new Student(19, "Brown","Mary", 88.5));
		
	
		try {
			System.out.println(new Student(-100,"Picard", "Jean-Luc"));
		} 
		catch (StudentDataException e){
			treatException(e);
			
		}
		
		try {
			System.out.println(new Student(100,"Picard2", "Jean-Luc",100));
		} 
		catch (StudentDataException e){
			treatException(e);
			
		}
		
		try {
			System.out.println(new Student(100,"Picard", "Jean+Luc",100));
		} 
		catch (StudentDataException e){
			treatException(e);
			
		}
		
		try {
			System.out.println(new Student(100,"Picard", "Jean-Luc",-20));
		} 
		catch (StudentDataException e){
			treatException(e);
			
		}
		
	}

}
