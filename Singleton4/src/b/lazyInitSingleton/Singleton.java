package b.lazyInitSingleton;

public class Singleton {

	private int data;

	private Singleton() {
		
		this.data = 0;
	}
	
	//initialisé l'objet avec null, ça veut dire que l'objet n'a pas été crée
	private static Singleton mary = null;
	
	//méthode pour retourner le object seulement quand la function est apellée
	public static Singleton getInstance() {
		if(mary == null) {
			mary = new Singleton();
		}
		return mary;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	
	
	
	
}
