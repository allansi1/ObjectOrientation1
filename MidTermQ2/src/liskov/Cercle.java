package liskov;

import java.util.*;

public class Cercle extends Conique {
	
		
	public Cercle(double r){
		setCote(r);	
	}
	

	public void setCote(double r)throws ConiqueDataException {
		if (r > 0) {
			this.sah = this.sav = r;
		}
		else {
			throw new ConiqueDataException(3,r);
		}
	}
}
