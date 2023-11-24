package pack;

public class Main {
	
	
	private static void display(PersonneDesiree personne) {
		System.out.println("Sexe: " + personne.getSexe());
        System.out.println("Âge minimal: " + personne.getMin_age());
        System.out.println("Âge maximal: " + personne.getMax_age());
        System.out.println("Pays d'origine: " + personne.getPays_origine());
        System.out.println("Couleur des cheveux: " + personne.getCouleur_cheveu());
        System.out.println("Couleur des yeux: " + personne.getCouleur_yeux());
        System.out.println("Niveau d'éducation: " + personne.getEducation());
	
}

	public static void main(String[] args) {
				
		PersonneDesiree personne1 = new PersonneDesiree.Builder("Femme")
	            .minAge(25)
	            .maxAge(35)
	            .paysOrigine("France")
	            .couleurCheveu("brune")
	            .couleurYeux("bleus")
	            .education("licence")
	            .build();

	        PersonneDesiree personne2 = new PersonneDesiree.Builder("Homme")
	            .minAge(30)
	            .maxAge(40)
	            .paysOrigine("États-Unis")
	            .couleurCheveu("blond")
	            .couleurYeux("verts")
	            .education("master")
	            .build();
	        
	        System.out.println("Personne 1:");
	        display(personne1);
	        System.out.println();
	        
	        System.out.println("Personne 2:");
	        display(personne2);
	        
	        
	        

	}

}
