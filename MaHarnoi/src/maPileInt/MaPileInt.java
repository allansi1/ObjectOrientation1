package maPileInt;

public class MaPileInt {
	
	private Integer [] data;
	private int maxSize;
	private int topIndex;

	
	//les constructeurs
	
	public MaPileInt() {
		maxSize = 10;
		data = new Integer [maxSize];
		topIndex = -1;
	}
	
	public MaPileInt(int size) {
		maxSize = size;
		data = new Integer [maxSize];
		topIndex = -1;
	}

	//les methodes
	
	public boolean push(int n) {
		if (topIndex < maxSize-1) {
			topIndex = topIndex+1;
			data[topIndex]=n;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Integer pop() {
		if (topIndex>-1) {
			int r = data[topIndex];
			topIndex = topIndex -1;
			return r;
		}
		else {
			return null;
		}
	}
	
	public Integer top() {
		if (topIndex>-1) {
			return data[topIndex];
			
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		String r = "[";
		for ( int i = 0; i<topIndex; i++) {
			r=r+data[i];
			if(i<topIndex) {
				r=r+",";
			}
		}
		r=r+"]";
		return r;
	}
}
