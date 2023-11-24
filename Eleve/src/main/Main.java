package main;

import eleve.eleve;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eleve e1 = new eleve(1, "Allan");
		eleve e2 = new eleve(2, "Fulano");
		eleve e3 = new eleve(3, "Cicrano");
		eleve e4 = new eleve(4, "Beltrano");
		
		System.out.println("Nombre eleves = " + eleve.nombreEleve());

	}

}
