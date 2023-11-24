package main;

import pack2.*;

public class Main_2 {

	public static void main(String[] args) {
		ITranslator a0 = new BasicTranslator("John"); 
		ITranslator a1= new Spanish (4,6,a0);
		ITranslator a2 = new Persian(5,10,a1); 
		
		System.out.println("Name: "+ a2.getName());
		System.out.println("Competences: " + a2.getCompetence());
		System.out.println("Details of spanish: "+ a2.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ a2.detailCompetence(Language.punjabi));
		
		ITranslator b = new Portuguese(5,8,
				        new Punjabi(4,12,
				        new Chinese(8,4,
				        new Persian(4,8, 
				        new BasicTranslator("Mary")))));
		
		System.out.println("Name: "+ b.getName());
		System.out.println("Competences: " + b.getCompetence());
		System.out.println("Details of spanish: "+ b.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ b.detailCompetence(Language.punjabi));


	}

}
