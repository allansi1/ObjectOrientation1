package eleve;

public class eleve {
	
	private static int nEleves = 0;
	private int id;
	private static String nom;
	
	public eleve(int id, String nom){
		this.nom = nom;
		this.id = id;
		nEleves++;
		
		
	}
	public static int nombreEleve() {
		
		return nEleves;
	}

}
