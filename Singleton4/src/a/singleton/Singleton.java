package a.singleton;

public class Singleton {

	private int data;

	private Singleton() {
		
		this.data = 0;
	}
	
	private static Singleton mary = new Singleton();
	
	public static Singleton getInstance() {
		
		return mary;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	
	
	
	
}
