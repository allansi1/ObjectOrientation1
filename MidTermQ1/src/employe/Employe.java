package employe;

public class Employe {
	
	private int id;
	private String nom;
	private String prenom;
	private double salaire;
	
	//Constructeur
	
	public Employe(int id, String nom, String prenom, double salaire) {
		setId(id);
		setNom(nom);
		setPrenom(prenom);
		setSalaire(salaire);
		
	}
	
	//getters and setters

	public int getId() {
		return id;
	}

	protected void setId(int id) throws EmployeDataException {
		if(id<=0) {
			throw new EmployeDataException(1,id);
		}
		else {
			this.id=id;
		}
	}

	public String getNom() {
		return nom;
	}

	protected void setNom(String nom) throws EmployeDataException {
		if(!nameValidate(nom)) {
			throw new EmployeDataException(3,nom);
		}
		else {
			this.nom = nom;
		}
	}

	public String getPrenom() {
		return prenom;
	}

	protected void setPrenom(String prenom)throws EmployeDataException {
		if(!nameValidate(prenom)) {
			throw new EmployeDataException(3,prenom);
		}
		else {
			this.prenom = prenom;
		}
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire)throws EmployeDataException {
		if (salaire < 0) {
			throw new EmployeDataException(4,salaire);
		}
		else {
			this.salaire = salaire;
		}
	}
	
		
	//Methodes
	
	
		private boolean nameValidate(String s) {
			for (int i = 0; i < s.length(); i++) {
		        char c = s.charAt(i);
		        if (!(Character.isLetter(c) || c == ' '|| c == '-')) {
		            return false;
		        }
		    }
		    return true;
		}
		
		@Override
		public String toString() {
			String s = String.format("[id = %d, nom = %s, prénom = %s, salaire = %.2f]", id, nom, prenom, salaire);
			return s;
		}
	
	
	
	

}
