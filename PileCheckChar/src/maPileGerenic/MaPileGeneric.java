package maPileGerenic;

public class MaPileGeneric <T> implements IPileGeneric <T>{

	private T[] data;
	private int maxSize;
	private int topIndex;
	
	//les constructeurs
	
	public MaPileGeneric() {
		maxSize = 10;
		data = (T[]) new Object [maxSize];
		topIndex = -1;
						
	}
	
	public MaPileGeneric(int size) {
		maxSize = size;
		data = (T[]) new Object [maxSize];
		topIndex = -1;
						
	}
	
	//les methodes
	@Override
	public boolean push (T n) {
		if (topIndex < maxSize - 1) {
			topIndex = topIndex + 1;
			data[topIndex] = n; 
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public T pop() {
		if (topIndex > -1) {
			T r = data[topIndex];
			topIndex = topIndex - 1;
			return r;
		}
		else {
			return null;
		}
	}
	@Override
	public T top() {
		if (topIndex > -1) {
			return data[topIndex];
		}
		else {
			return null;
		}
	}
	@Override
	public boolean empty() {
		return (topIndex == -1);
	}
	@Override
	public boolean full() {
		return (topIndex == maxSize -1);
	}
	@Override
	public int maxSize() {
		return maxSize;
	}
	@Override
	public int size() {
		return topIndex+1;
	}
	
	@Override
	public String toString() {
		String r = "[";
		for (int i = 0; i<=topIndex;i++) {
			r = r + data[i].toString();
			if(i<topIndex) {
				r=r+",";
			}
		}
		r = r+"]";
		return r;
		
		
	}
	//cette méthode n'est pas éxigée par l'interface IPileGeneric
	public void reset() {
		topIndex=-1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
