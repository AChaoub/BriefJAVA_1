package com.Brief_1.app;

import java.util.Scanner;




public class briefJava1 {
	
	public static double tarifExtra(int heure,double tarif) {
		return (heure * tarif)/2;
	}
	
	public static double tarifOridinaire(int heure,double tarif) {
		return heure * tarif;
	}
	
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int heure = 0;
		double tarif = 0;
		String nom;
		String prenom;
		double salaire = 0;
		
		Scanner  inputTarif = null;
		Scanner  inputHeure =null;
		Scanner  inputPrenom =null;
		Scanner  inputNom =null;
	
		
		try {
			
			inputTarif  = new Scanner(System.in);
			inputHeure = new Scanner(System.in);
			inputPrenom = new Scanner(System.in);
			inputNom = new Scanner(System.in);
			
			int DiffHeure;
			
			System.out.println("--------------------Calculez votre indemnisation-------------------- ");
			
			System.out.print("Entrez votre nom : \t");
			nom = inputNom.nextLine().toUpperCase();
			
			System.out.print("Entrez votre prenom : \t");
			prenom = inputPrenom.nextLine();
			
			System.out.println(" \n \t \t Bienvenue " + nom +"\n");
			
			
			System.out.println("Combien des heures avez vous travailler cette semaine ?");
			heure = inputHeure.nextInt();
			
			if((heure <60) && (heure>=1)){
				
				System.out.println("Entrez le tarif :");
				tarif = inputTarif.nextDouble();
				
				/* Condition des heures supp*/
				if(heure>40) {
					
					DiffHeure =  heure - 40;
					salaire = tarifOridinaire(heure, tarif)+tarifExtra(DiffHeure, tarif);
					
				}
				else {
					salaire = tarifOridinaire(heure, tarif);
				}
				System.out.println("votre indemnisation est de "+salaire+ " MAD");
				
			}else
				System.out.println("informations erronés ! ");
			

		}
		finally {
		    if((inputHeure!=null)||(inputTarif!=null)||(inputPrenom!=null)||(inputNom!=null)) {
		    	inputHeure.close();
		    	inputTarif.close();
		    	inputNom.close();
		    	inputPrenom.close();
		    }
		}
	}

}
