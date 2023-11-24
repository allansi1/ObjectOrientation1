package d.multiSingleton;

import java.util.*;

public class Singleton {

	private String key;
	private int data;
	

	private Singleton(String key) {
		
		this.key = key;
		this.data = 0;
	}
	
	
	private static ArrayList<Singleton> mary = new ArrayList<Singleton>();
	
	
	public static Singleton getInstance(String key) {
		Singleton result = null;
		boolean found = false;
		for (int i = 0; i < mary.size() &&!found; i++) {
			if(mary.get(i).getKey() == key) {
				result = mary.get(i);
				found = true;
			}
		}
		if (result == null) {
			result = new Singleton(key);
			mary.add(result);
		}
		return result;
		
	}
	
	//=====================================================
	public String getKey() {
		return this.key;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	
	
	
	
}
