package b.lazyInitSingleton;

public class Singleton {
	/* 
	 * Le nom de la classe peut être n'importe quel nom. 
	 */
	private int data ;
	
	/*===================================================================================*/
	
	/* 
	 * Pour que la classe soit une classe Singleton, il y a trois caracteristiques:
	 * 
	 * 1. Avoir le constructeur privé
	 * 2. Avoir une variable privé statique pour garder le seul objet qui sera créé 
	 *    à partir de cette classe. 
	 * 3. Avoir une méthode public statique pour retourner le seul objet créé 
	 *    à partir de cette classe.
	 *      
	 */ 
	
	/* Constructeur privé */
	private Singleton() {
		this.data=0;
	}
    
	/* variable privé statique pour garder le seul objet créé à partir de cette classe */ 
	/* 
	  * Attention: l'objet sera créé le plus tard possible, c'est-à-dire,
	 * au moment du premier appel de la méthode getINSTANCE(). 
	 * Ce type de singleton est appelé "Lazy Initialization Singleton". 
	 * 	 
	 */ 
	private static Singleton mary= null;
	
	/* méthode public statique pour retourner le seul objet créé à partir de cette classe */
	public static Singleton getINSTANCE() {
		if (mary==null) {
			mary= new Singleton();
		}
		return mary;
	}
	
	/*===================================================================================*/
	
	public int getData() {
		return this.data;
	}
	public void setData(int data) {
		/*
		 * Les validations nécessaires
		 */
		this.data=data;
	}

}

