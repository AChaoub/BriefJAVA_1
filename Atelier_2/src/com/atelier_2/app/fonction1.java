package com.atelier_2.app;
import java.util.Scanner;

public class fonction1 {
	
	public static void nomPrenom(String nom ,String prenom,int age) {
		System.out.println(" \n \t Bonjour " + nom +" "+ prenom + ", tu as " + age + "ans");
	}
	
	public static void main(String[] args) {
		String nom;
		String prenom;
		int age;
		
		Scanner  clavier  = new Scanner(System.in);
		
		System.out.println("Entrez votre nom :");
		nom = clavier.nextLine();
		
		System.out.println("Entrez votre prenom :");
		prenom = clavier.nextLine();
		
		System.out.println("Entrez votre age:");
		age = clavier.nextInt();
		
		
		nomPrenom(nom, prenom, age);
		
		
	
	}
}
