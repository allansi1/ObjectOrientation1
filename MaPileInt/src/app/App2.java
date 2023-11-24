package app;

import maPileInt.*;

public class App2 {

	public static void main(String[] args) {
		MaPileInt pile1 = new MaPileInt(20);
		MaPileInt pile2 = new MaPileInt(20);
		

		pile1.push(100);
		pile1.push(200);
		pile1.push(300);
		pile1.push(400);
		
		System.out.println(pile1.top());
		Integer e = pile1.pop();
		while (e!=null) {
			System.out.println(e);
			pile2.push(e);
			e=pile1.pop();
			
		}
		
		Integer e2 = pile2.pop();
		while (e2!=null) {
			pile1.push(e2);
			e2=pile2.pop();
			
		}

	}

}
