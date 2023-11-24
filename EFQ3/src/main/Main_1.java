package main;
import pack.*;

public class Main_1 {

	public static void main(String[] args) {
		IDev a0 = new BasicDev("John"); 
		IDev a1= new Java (a0);
		IDev a2 = new CPP(a1); 
		
		System.out.println("Name: "+ a2.getName());
		System.out.println("Competences: " + a2.getCompetence());
		System.out.println("Details of spanish: "+ a2.detailCompetence(Language.JAVA));
		System.out.println("Details of punjabi: "+ a2.detailCompetence(Language.PYTHON));
		
		System.out.println();
		IDev b = new CSharp(
				 new Java(
				 new CPP(
				 new Python( 
				 new BasicDev("Mary")))));
		
		System.out.println("Name: "+ b.getName());
		System.out.println("Competences: " + b.getCompetence());
		System.out.println("Details of spanish: "+ b.detailCompetence(Language.CSHARP));
		System.out.println("Details of spanish: "+ b.detailCompetence(Language.JAVA));
		System.out.println("Details of punjabi: "+ b.detailCompetence(Language.WEB));
		
	}

}
