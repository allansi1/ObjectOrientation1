package app;

import maPileGerenic.*;
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaPileGeneric<String> p = new MaPileGeneric<String>();
		System.out.println("Est-ce que p est vide: " + p.empty());
		System.out.println("Taille de p est: " + p.maxSize());
		
		p.push("Bonjour");
		p.push("Bonsoir");
		System.out.println("Est-ce que p est vide: " + p.empty());
		System.out.println("Taille maximale de p est: " + p.maxSize());
		System.out.println("Taille courante de p est: " + p.size());
		System.out.println("Est-ce que p est plein: " + p.full());
		System.out.println("Top de p est: " + p.top());
		
		MaPileGeneric<String> p1 = new MaPileGeneric<String>(3);
		System.out.println("Taille maximale de p1 est: " + p1.maxSize());
		System.out.println("Taille courante de p1 est: " + p1.size());
		p1.push("Un");
		p1.push("Deux");
		p1.push("Trois");
		p1.push("Quatre");
		System.out.println("p1 = " + p1);
		System.out.println("Top de p1: " + p1.top());
		System.out.println("Est-ce que p1 est plein: " + p1.full());
	
	}
}