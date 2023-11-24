package d.multiSingleton;

import java.util.*;

public class Singleton {
	/* 
	 * Le nom de la classe peut être n'importe quel nom. 
	 */
	private String key ;
	private int data;
	
	/*===================================================================================*/
	
	/* 
	 * Pour que la classe soit une classe Singleton à paramètre, il y a trois caracteristiques:
	 * 
	 * 1. Avoir le constructeur privé
	 * 2. Avoir une variable privé statique pour garder le seul objet (pour chaque valeur 
	 *    de la clé) qui sera créé à partir de cette classe. 
	 * 3. Avoir une méthode public statique pour retourner le seul objet (pour chaque valeur
	 *    de la clé) créé à partir de cette classe.
	 *      
	 */ 
	
	/* Constructeur privé */
	private Singleton(String key) {
		this.key=key;
		this.data=0;
	}
    
	/* 
	 * variable privé statique pour garder le seul objet (pour chaque valeur de la clé)
	 *  créé à partir de cette classe 
	 */ 
	/* 
	  * Attention: l'objet sera créé le plus tard possible, c'est-à-dire,
	 * au moment du premier appel de la méthode getINSTANCE(). 
	 * Ce type de singleton est appelé "Lazy Initialization Singleton". 
	 * 	 
	 */ 
	private static ArrayList<Singleton> mary= new ArrayList<Singleton>();
	
	/* 
	 * méthode public statique pour retourner le seul objet (pour chaque valeur 
	 * de la clé) créé à partir de cette classe 
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
		 * Les validations nécessaires
		 */
		this.data=data;
	}

}

