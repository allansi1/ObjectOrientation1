package employe;

import java.util.*;





public class Main {
	private static void treatException(EmployeDataException e) {
	
		e.printStackTrace();
		if(e.getCode()==1) {
			System.err.print("L'id "+ (int)e.getObj()+ " ne doit pas être zero ou négatif.");
		}
		else if(e.getCode()==2) {
			System.err.print("Le nom " + (String)e.getObj() + " inséré n'est pas valide.");
		}
		else if(e.getCode()==3) {
			System.err.print("Le prenom " + (String)e.getObj() + " inséré n'est pas valide.");
		}
		else if(e.getCode()==4) {
			System.err.print("Le salaire " + (double)e.getObj() + " ne doit pas être négatif.");
		}
		else {
			System.err.print("Erreur inconnu");
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employe e1 = new Employe(1000, "Benz", "João", 15000.00);
		Employe e2 = new Employe(1010, "Lobo", "Puerto", 25000.00);
		Employe e3 = new Employe(1040, "Frontenac", "Jean-Talon", 3000.00);
		Employe e4 = new Employe(1020, "Silva", "Antônio José", 45000.00);
		
		List <Employe> list = new ArrayList<Employe>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		
		System.out.println("ArrayList par l'ordre d'inclusion");
		for(Employe a: list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList par l'ordre d'id");
		Collections.sort(list, new IdComparator());
		for(Employe a : list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList par l'ordre de nom, prenom");
		Collections.sort(list, new NameComparator());
		for(Employe a : list)
			System.out.println(a);
		System.out.println();
		
		System.out.println("ArrayList par l'ordre de salaire");
		Collections.sort(list, new SalaryComparator());
		for(Employe a : list)
			System.out.println(a);
		System.out.println();
		
		try {
			//System.out.println(new Employe(-100,"Picard", "Jean-Luc", 0));
			//System.out.println(new Employe(100,"Picard", "Jean-Luc", -100.00));
			//System.out.println(new Employe(100,"Jean", "3", 0));
			
		} 
		catch (EmployeDataException e){
			treatException(e);
		}
	

	}

}


