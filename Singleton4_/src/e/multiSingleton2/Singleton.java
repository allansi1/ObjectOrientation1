package e.multiSingleton2;

import java.util.*;

public class Singleton {
	/* 
	 * Le nom de la classe peut �tre n'importe quel nom. 
	 */
	private String key ;
	private int data;
	
	/*===================================================================================*/
	
	/* 
	 * Pour que la classe soit une classe Singleton � param�tre, il y a trois caracteristiques:
	 * 
	 * 1. Avoir le constructeur priv�
	 * 2. Avoir une variable priv� statique pour garder le seul objet (pour chaque valeur 
	 *    de la cl�) qui sera cr�� � partir de cette classe. 
	 * 3. Avoir une m�thode public statique pour retourner le seul objet (pour chaque valeur
	 *    de la cl�) cr�� � partir de cette classe.
	 *      
	 */ 
	
	/* Constructeur priv� */
	private Singleton(String key) {
		this.key=key;
		this.data=0;
	}
    
	/* 
	 * variable priv� statique pour garder le seul objet (pour chaque valeur de la cl�)
	 *  cr�� � partir de cette classe 
	 */ 
	/* 
	  * Attention: l'objet sera cr�� le plus tard possible, c'est-�-dire,
	 * au moment du premier appel de la m�thode getINSTANCE(). 
	 * Ce type de singleton est appel� "Lazy Initialization Singleton". 
	 * 	 
	 */ 
	private static HashMap<String, Singleton> mary= new HashMap<String, Singleton>();
	
	/* 
	 * m�thode public statique pour retourner le seul objet (pour chaque valeur 
	 * de la cl�) cr�� � partir de cette classe 
	 */
	public static Singleton getINSTANCE(String key) {
		if (!mary.containsKey(key)){
			mary.put(key,new Singleton(key));
		}
		return mary.get(key);
	}
	
	/*===================================================================================*/
	
	public String getKey() {
		return this.key;
	}
	
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

