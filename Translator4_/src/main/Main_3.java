package main;

import pack3.*;

public class Main_3 {

	public static void main(String[] args) {
		ITranslator a0 = new BasicTranslator("John"); 
		ITranslator a1= new Spanish (4,6,a0);
		ITranslator a2 = new Persian(5,10,a1); 
		
		System.out.println("Name: "+ a2.getName());
		System.out.println("Competences: " + a2.getCompetence());
		System.out.println("Details of spanish: "+ a2.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ a2.detailCompetence(Language.punjabi));
		
		System.out.println("Years of Instruction in "+Language.spanish+": "+a2.getYearOfInst(Language.spanish));
		System.out.println("Years of Experience in "+Language.spanish+": "+a2.getYearOfExp(Language.spanish));
		System.out.println("Years of Instruction in "+Language.punjabi+": "+a2.getYearOfInst(Language.punjabi));	
		System.out.println("Years of Experience in "+Language.punjabi+": "+a2.getYearOfExp(Language.punjabi));
		
		ITranslator b = new Portuguese(5,8,
				        new Punjabi(4,12,
				        new Chinese(8,4,
				        new Persian(4,8, 
				        new BasicTranslator("Mary")))));
		
		System.out.println("Name: "+ b.getName());
		System.out.println("Competences: " + b.getCompetence());
		System.out.println("Details of spanish: "+ b.detailCompetence(Language.spanish));
		System.out.println("Details of punjabi: "+ b.detailCompetence(Language.punjabi));
		
		System.out.println("Years of Instruction in "+Language.spanish+": "+b.getYearOfInst(Language.spanish));
		System.out.println("Years of Experience in "+Language.spanish+": "+b.getYearOfExp(Language.spanish));
		System.out.println("Years of Instruction in "+Language.punjabi+": "+b.getYearOfInst(Language.punjabi));	
		System.out.println("Years of Experience in "+Language.punjabi+": "+b.getYearOfExp(Language.punjabi));
	}

}
