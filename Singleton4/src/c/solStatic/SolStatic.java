package c.solStatic;

public class SolStatic {
	
	private static int data = 0;
	
	//Pour la solution static, on a les variables privées statiques
	//et les méthodes getters and setters public statiques aussi
	//Ce type de solution peut être une alternatif à l'utilisation de Singleton
	//pour les cas plus simples

	public static int getData() {
		return data;
	}

	public static void setData(int d) {
		data = d;
	}
}
