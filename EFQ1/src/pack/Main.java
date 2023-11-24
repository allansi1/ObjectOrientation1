package pack;

public class Main {

	public static void main(String[] args) {
		 Starfleet starfleet = new Starfleet();

	       
	        Starfleet.Capitaine cap1 = new Starfleet.Capitaine("Jean-Luc Picard");
	        Starfleet.Capitaine cap2 = new Starfleet.Capitaine("Benjamin Sisco");
	        Starfleet.Capitaine cap3 = new Starfleet.Capitaine("Katherine Janeway");

	        
	        Starfleet.Batiment bat1 = new Starfleet.Batiment("vaisseau", "Enterprise");
	        Starfleet.Batiment bat2 = new Starfleet.Batiment("base stellaire", "Deep Space 9");
	        Starfleet.Batiment bat3 = new Starfleet.Batiment("vaisseau", "Voyageur");

	        
	        starfleet.assignerCapitaine(bat1, cap1);
	        starfleet.assignerCapitaine(bat2, cap2);
	        starfleet.assignerCapitaine(bat3, cap3);

	        
	        System.out.println(cap1.getNom() + " commande le bâtiment \"" + bat1.getNom() + "\"");
	        System.out.println("Le bâtiment \"" + bat1.getNom() + "\" est du type \"" + bat1.getType() + "\" et est commandé par le capitaine \"" + bat1.getCapitaine().getNom() + "\"");

	        System.out.println("Le bâtiment \"" + bat2.getNom() + "\" est du type \"" + bat2.getType() + "\" et est commandé par le capitaine \"" + bat2.getCapitaine().getNom() + "\"");

	        System.out.println("Le bâtiment \"" + bat3.getNom() + "\" est du type \"" + bat3.getType() + "\" et est commandé par le capitaine \"" + bat3.getCapitaine().getNom() + "\"");

	        
	        Starfleet.retirerCapitaine(cap1);
	        Starfleet.retirerBatiment(bat1);

	}

}
