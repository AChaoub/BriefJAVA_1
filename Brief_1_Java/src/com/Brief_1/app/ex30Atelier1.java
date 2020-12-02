package com.Brief_1.app;
import java.util.Scanner;

public class ex30Atelier1 {
	
	/*
	 * Fonction affichageMenu ()
		DEBUT
		Ecrire « 1- POUR LA FACTORIELLE »
		Ecrire « 2-POUR LA SOMME »
		Lire choix 
		FIN	
		Fonction factorielle (n :ENTIER)
			DEBUT
			Var res :ENTIER
			If(n==0)
				res = 1 ;
			POUR var i = 1 allant n pas 1 faire
				res *= i
			FINPOUR
		 	Afficher res ;
		FIN
		
		Fonction somme (n :ENTIER)
			DEBUT
				Var res :ENTIER
				POUR var i = 1 allant n pas 1 faire
					res += i
				FINPOUR
			 	Afficher res ;
			FIN

ALGORITHME Ex30
VARIABLES  
		nombre :ENTIER
		
DEBUT
	Ecrire (« entrez un nombre ») ;
	Lire nombre ;
	
	SELON  affichageMenu () 
		Cas 1 : factorielle(nombre)
		Cas2 : somme(n)
		Autrement ecrire « veuillez entrer un nombre valide »
	FINSELON

FIN
*/
	public static int affichageMenu() {
		int res = 0;
		Scanner choix = new Scanner(System.in);
		System.out.println("1-POUR LA FACTORIELLE");
		System.out.println("2-POUR LA SOMME");
		res = choix.nextInt();
		choix.close();
		return res;
	}
	
	public static int factorielle(int nombre) {
		int factorielle = 1 ;
		
		for (int i = 1;i<=nombre;i++) {
			factorielle = factorielle*i;
			
		}
		if(nombre == 0) {
			factorielle = 1;
		}
		
		return factorielle;
	}
	
	public static int somme(int nombre) {
		int somme = 0;
		
		for (int i = 0;i<nombre;i++) {
			somme += i+1;
			
		}
		return somme;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre = 0;
		Scanner inputNombre = new Scanner(System.in);
		
		
		System.out.println("Entrez un nombre");
		nombre = inputNombre.nextInt();
		
		switch (affichageMenu()){
			case 1 : 
				System.out.println("La Factorielle du nombre "+nombre+" est :"+factorielle(nombre));
				break;
			
			case 2 : 
				System.out.println("La somme du nombre "+nombre+" est : "+somme(nombre));
				break;
			default : 
				System.out.println("Veuillez entre un nombre valide , relancez le programme");
		
		}
		
		inputNombre.close();
		
	}

}
