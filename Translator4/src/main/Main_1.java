package main;

import pack1.*;

public class Main_1 {

	public static void main(String[] args) {
		ITranslator a0 = new BasicTranslator("John"); 
		ITranslator a1= new Spanish (a0);
		ITranslator a2 = new Persian(a1); 
		
		System.out.println("Name: "+ a2.getName());
		System.out.println("Competences: " + a2.getCompetence());
		System.out.println("Details of spanish: "+ a2.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ a2.detailCompetence(Language.punjabi));
		
		ITranslator b = new Portuguese(
				        new Punjabi(
				        new Chinese(
				        new Persian( 
				        new BasicTranslator("Mary")))));
		
		System.out.println("Name: "+ b.getName());
		System.out.println("Competences: " + b.getCompetence());
		System.out.println("Details of spanish: "+ b.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ b.detailCompetence(Language.punjabi));
		
	}

}
