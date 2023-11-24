package liskov;



public class Main {
	
	private static void treatException(ConiqueDataException e) {
		
		e.printStackTrace();
		if(e.getCode()==1) {
			System.err.print("Le semi-axe horizontal (sah) " + (double)e.getObj()+ " ne doit pas être zero ou négatif.");
		}
		else if(e.getCode()==2) {
			System.err.print("Le semi-axe horizontal (sav)" + (double)e.getObj() + " ne doit pas être zero ou négatif.");
		}
		else if(e.getCode()==3) {
			System.err.print("Le rayon (r) " + (double)e.getObj() + " ne doit pas être zero ou négatif.");
		}
		else {
			System.err.print("Erreur inconnu");
		}
	}
	
	
	public static String myF(Elipse r)
	{
		double aire = r.Aire();
		r.setCote(r.getH(), 2*r.getV());
		if (r.Aire()==2*aire) {
			return "OK";
		}
		else {
			throw new RuntimeException("L'aire de l'elipse n'est pas égale au double de l'aire d'origine.");
		}
	}
	
	
	
	public static String myF2(Cercle r)
	{
		double aire = r.Aire();
		r.setCote(2*r.getH());
		if (r.Aire()==2*aire) {
			return "OK";
		}
		else {
		throw new RuntimeException("L'aire du cercle n'est pas égale au double de l'aire d'origine.");
		}
	}

	public static void main(String[] args) {
		
		try {
		//Elipse r0 = new Elipse(2,-3);
		//Cercle c0 = new Cercle(-1);
		}
		catch (ConiqueDataException e){
			treatException(e);
		}
		
		Elipse r1 = new Elipse(5,7);
		System.out.println("Elipse r1 = " + r1);
		System.out.println("Aire de Elipse r1 = " + r1.Aire());
		System.out.println("Elipse r1 is "+ myF(r1));
		System.out.println("r1 = " + r1);
		System.out.println("Aire de Elipse r1 doublé = " + r1.Aire());
		System.out.println();
		
		Elipse r2 = new Elipse (7,7);
		System.out.println("Elipse r2 = " + r2);
		System.out.println("Aire de Elipse r2 = " + r2.Aire());
		System.out.println("Elipse r2 is "+ myF(r2));
		System.out.println("r2 = " + r2);
		System.out.println("Aire de Elipse r2 doublé = " + r2.Aire());
		System.out.println();
		
		Cercle c = new Cercle(5);
		System.out.println("Cercle c = " + c);
		System.out.println("Aire du Cercle c = " + c.Aire());
		//System.out.println("Cercle c is "+ myF2(c));
		
		
		
		
		
	}
}
