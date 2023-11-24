package d.multiSingleton;

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
	private static ArrayList<Singleton> mary= new ArrayList<Singleton>();
	
	/* 
	 * m�thode public statique pour retourner le seul objet (pour chaque valeur 
	 * de la cl�) cr�� � partir de cette classe 
	 */
	public static Singleton getINSTANCE(String key) {
		Singleton result=null;
		boolean found = false;
		for (int i=0 ; i<mary.size() && !found; i++){
			if (mary.get(i).getKey()==key){ 
				result = mary.get(i);
				found=true;
			}	
		}
		if (result==null){
			result = new Singleton(key);
			mary.add(result);
		}
		return result;
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

