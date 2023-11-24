package c.solStatic;

public class SolStatic {
	/* 
	 * Le nom de la classe peut �tre n'importe quel nom. 
	 */
	private static int data=0; 
	
	/*===================================================================================*/
	
	/*
	 * Pour la solution statique, on a les variable priv�es statiques 
	 * et les m�thodes "getters" and "setters" publique statiques.
	 * 
	 * Ce type de solution peut �tre une alternative � l'utilisation 
	 * de Singleton pour les cas les plus simples.
	 * 
	 */
	
	public static int getData() {
		return data;
	}
	public static void setData(int d) {
		/*
		 * Les validations n�cessaires
		 */
		data=d;
	}

}
