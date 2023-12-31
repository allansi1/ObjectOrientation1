package a.singleton;

public class Singleton {
	/* 
	 * Le nom de la classe peut �tre n'importe quel nom. 
	 */
	private int data ;
	
	/*===================================================================================*/
	
	/* 
	 * Pour que la classe soit une classe Singleton, il y a trois caracteristiques:
	 * 
	 * 1. Avoir le constructeur priv�
	 * 2. Avoir une variable priv� statique pour garder le seul objet qui sera cr�� 
	 *    � partir de cette classe. 
	 * 3. Avoir une m�thode public statique pour retourner le seul objet cr�� 
	 *    � partir de cette classe.
	 *      
	 */ 
	
	/* Constructeur priv� */
	private Singleton() {
		this.data=0;
	}
    
	/* variable priv� statique pour garder le seul objet cr�� � partir de cette classe */ 
	/* 
	 * Attention: l'objet sera cr�� au plus t�t possible, c'est-�-dire,
	 * au moment que la classe Singleton est mise en m�moire. 
	 * Ce type de singleton est appel� "Eager Initialization Singleton". 
	 * 	 
	 */ 
	private static Singleton mary= new Singleton();
	
	/* m�thode public statique pour retourner le seul objet cr�� � partir de cette classe */
	public static Singleton getINSTANCE() {
		return mary;
	}
	
	/*===================================================================================*/
	
	public int getData() {
		return this.data;
	}
	public void setData(int data) {
		/*
		 * Les validations n�cessaires
		 */
		this.data=data;
	}

}

