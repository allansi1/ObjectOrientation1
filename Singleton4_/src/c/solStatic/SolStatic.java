package c.solStatic;

public class SolStatic {
	/* 
	 * Le nom de la classe peut être n'importe quel nom. 
	 */
	private static int data=0; 
	
	/*===================================================================================*/
	
	/*
	 * Pour la solution statique, on a les variable privées statiques 
	 * et les méthodes "getters" and "setters" publique statiques.
	 * 
	 * Ce type de solution peut être une alternative à l'utilisation 
	 * de Singleton pour les cas les plus simples.
	 * 
	 */
	
	public static int getData() {
		return data;
	}
	public static void setData(int d) {
		/*
		 * Les validations nécessaires
		 */
		data=d;
	}

}
