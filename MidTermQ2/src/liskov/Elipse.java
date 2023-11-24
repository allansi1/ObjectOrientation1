package liskov;

import java.util.*;



public class Elipse extends Conique {
	
	
	
	public Elipse(double sah, double sav){
		setCote(sah,sav);
	}
	
	public void setCote(double sah, double sav)throws ConiqueDataException {
		if (sah > 0) {
			this.sah = sah;
		}
		else {
			throw new ConiqueDataException(1,sah);
		}
		if (sav > 0) {
			this.sav = sav;
		}	
		else {
			throw new ConiqueDataException(2,sav);
		}
	}
}

