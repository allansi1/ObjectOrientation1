package maHanoi;
import maPileInt.*;

public class Hanoi {

	static int numberOfDisks =4;
	static MaPileInt s1 = new MaPileInt(numberOfDisks);
	static MaPileInt s2 = new MaPileInt(numberOfDisks);
	static MaPileInt s3 = new MaPileInt(numberOfDisks);
	
	static void printHanoi() {
		System.out.println();
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
				
	}
	
	public static void solve (int n, MaPileInt orig, MaPileInt aux, MaPileInt dest) {
		if (n>0) {
			solve (n-1, orig,dest,aux);
			dest.push(orig.pop()); //move (orig, dest)
			printHanoi();
			solve(n-1,aux,orig,dest);
				
			
		}
		
	}
	
	public static void main(String[] args) {
	
		//Inicialisation
		for (int i = numberOfDisks;i>0; i-- ) {
			s1.push(i);
		}
		
		//Impression
		printHanoi();
		
		//Solution
		solve(numberOfDisks,s1,s2,s3);

	}

}
