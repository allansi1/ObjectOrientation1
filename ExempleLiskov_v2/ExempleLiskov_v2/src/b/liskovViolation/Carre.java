package b.liskovViolation;

public class Carre extends Rectangle {
	
	public Carre(){
//		super();
		this.setCote(0, 0);
	}
	
	public Carre(int c){
//		super(c,c);
		this.setCote(c, c);
	}

	/*
	 * Il faut faire an override de la méthode setCote(c1,c2) 
	 * parce que quand on change les côtés d'un carré, le carré 
	 * doit rester avec les côtes égaux.
	 */
	@Override
	public void setCote(int c1, int c2) {
		if(c1==c2) {
			super.setCote(c1, c2);
		}	
	}

}
