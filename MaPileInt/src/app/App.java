package app;

import maPileInt.MaPileInt;

public class App {

	public static void main(String[] args) {
		MaPileInt pile1 = new MaPileInt();
		
		
		pile1.push(100);
		pile1.push(200);
		pile1.push(300);
		pile1.push(400);
		
		System.out.println(pile1.top());
		Integer e = pile1.pop();
		while (e!=null) {
			System.out.println(e);
			e=pile1.pop();
			
		}
		System.out.println(pile1.top());

	}

}
