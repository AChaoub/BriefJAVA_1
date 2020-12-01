package com.atelier_2.app;
import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int prixHt ;
		int taux;
		int prixTtc ;
		
		Scanner  clavier  = new Scanner(System.in);
		prixTtc  = 0; 
		
		System.out.println("Entrez un prix HT :");
		prixHt = clavier.nextInt();
		System.out.println("Entrez un taux :");
		taux = clavier.nextInt();
		
		prixTtc = prixHt + ((prixHt*taux)/100);
		
		System.out.println("Le prix TTC est :"+ prixTtc+" DHS");
		
		
 
	}

}
