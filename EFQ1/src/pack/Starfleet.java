package pack;

import java.util.ArrayList;
import java.util.List;

public class Starfleet {
	
	private static List<Capitaine> capitaines = new ArrayList<>();
    private static List<Batiment> batiments = new ArrayList<>();


    public static class Capitaine {
        private String nom;
        private Batiment batiment;

        public Capitaine(String nom) {
            this.nom = nom;
            capitaines.add(this);
        }

        public String getNom() {
            return nom;
        }

        public Batiment getBatiment() {
            return batiment;
        }

        public void assignerBatiment(Batiment batiment) {
            this.batiment = batiment;
        }
    }

    public static class Batiment {
        private String nom;
        private String type;
        private Capitaine capitaine;

        public Batiment(String type, String nom) {
            this.type = type;
            this.nom = nom;
            batiments.add(this);
        }

        public String getNom() {
            return nom;
        }

        public String getType() {
            return type;
        }

        public Capitaine getCapitaine() {
            return capitaine;
        }

        public void assignerCapitaine(Capitaine capitaine) {
            this.capitaine = capitaine;
        }
    }
    
    public void assignerCapitaine(Batiment batiment, Capitaine capitaine) {
    	
        batiment.assignerCapitaine(capitaine);
        capitaine.assignerBatiment(batiment);
    }
    
    public static void retirerCapitaine(Capitaine capitaine) {
        capitaines.remove(capitaine);
    }
    
    public static void retirerBatiment(Batiment batiment) {
        batiments.remove(batiment);
    }
    
    
}