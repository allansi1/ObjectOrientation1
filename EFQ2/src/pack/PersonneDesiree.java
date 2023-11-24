package pack;

public class PersonneDesiree {
	
	private final String sexe;
    private final int min_age;
    private final int max_age;
    private final String pays_origine;
    private final String couleur_cheveu;
    private final String couleur_yeux;
    private final String education;

    private PersonneDesiree(Builder builder) {
        this.sexe = builder.sexe;
        this.min_age = builder.min_age;
        this.max_age = builder.max_age;
        this.pays_origine = builder.pays_origine;
        this.couleur_cheveu = builder.couleur_cheveu;
        this.couleur_yeux = builder.couleur_yeux;
        this.education = builder.education;
    }
    
    public String getSexe() {
    	return sexe;
    }
    
    public int getMin_age() {
		return min_age;
	}

	public int getMax_age() {
		return max_age;
	}

	public String getPays_origine() {
		return pays_origine;
	}

	public String getCouleur_cheveu() {
		return couleur_cheveu;
	}

	public String getCouleur_yeux() {
		return couleur_yeux;
	}

	public String getEducation() {
		return education;
	}

    public static class Builder {
        private final String sexe;
        private int min_age = 18;
        private int max_age = 110;
        public String getSexe() {
			return sexe;
		}

		
		private String pays_origine = "";
        private String couleur_cheveu = "";
        private String couleur_yeux = "";
        private String education = "";

       
        
        public Builder(String sexe) {
            this.sexe = sexe;
        }

        public Builder minAge(int min_age) {
            this.min_age = Math.max(18, min_age);
            return this;
        }

        public Builder maxAge(int max_age) {
            this.max_age = Math.min(110, max_age);
            return this;
        }

        public Builder paysOrigine(String pays_origine) {
            this.pays_origine = pays_origine;
            return this;
        }

        public Builder couleurCheveu(String couleur_cheveu) {
            this.couleur_cheveu = couleur_cheveu;
            return this;
        }

        public Builder couleurYeux(String couleur_yeux) {
            this.couleur_yeux = couleur_yeux;
            return this;
        }

        public Builder education(String education) {
            this.education = education;
            return this;
        }

        public PersonneDesiree build() {
        	if (min_age > max_age) {
                throw new IllegalArgumentException("L'âge minimal ne peut pas être supérieur à l'âge maximal");
            }
        	
        	return new PersonneDesiree(this);
        }
    }

}
