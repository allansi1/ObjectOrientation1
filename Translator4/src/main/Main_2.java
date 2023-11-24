package main;

import pack2.*;

public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITranslator a0 = new BasicTranslator("John"); 
		ITranslator a1= new Spanish (a0,2,3);
		ITranslator a2 = new Persian(a1,1,3); 
		
		System.out.println("Name: "+ a2.getName());
		System.out.println("Competences: " + a2.getCompetence());
		System.out.println("Details of spanish: "+ a2.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ a2.detailCompetence(Language.punjabi));
		System.out.println();
		
		ITranslator b = new Portuguese(
				        new Punjabi(
				        new Chinese(
				        new Persian( 
				        new BasicTranslator("Mary"),0,0),10,3),3,4),1,2);
		
		System.out.println("Name: "+ b.getName());
		System.out.println("Competences: " + b.getCompetence());
		System.out.println("Details of spanish: "+ b.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ b.detailCompetence(Language.punjabi));
		System.out.println();
		
		ITranslator c = new Persian(
		        new BasicTranslator("Charles"),4,5);
		
		System.out.println("Name: "+ c.getName());
		System.out.println("Competences: " + c.getCompetence());
		System.out.println("Details of persian: "+ c.detailCompetence(Language.persian));
		System.out.println("Details of punjabi: "+ c.detailCompetence(Language.punjabi));
		
		

		

	}

}
