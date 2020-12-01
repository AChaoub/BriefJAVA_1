package com.atelier_2.app;

import java.util.Scanner;

public class fonction2 {
	
	public static String traitementGenreAge(char genre,int age) {
		String res = "";
		if((etreHomme1(genre) == 1) && (age>0)){
			res += "\n Vous etes homme";
			if(etreMajeur(age)==1) {
				res += ",et vous etes majeur.";
			}
			else if (etreMajeur(age)==0) {
				res += ",et vous etes mineur.";
			}
			else{
				System.out.print("Entrez un age valide supperieure a ZERO!!!");
			}
		}
		else if((etreHomme1(genre) == 0) && (age>0)) {
			res += "\n Vous etes femme";
			if(etreMajeur(age) == 1) {
				res += ",et vous etes majeur.";
			}
			else if (etreMajeur(age) == 0) {
				res += ", et vous etes mineur.";
			}
			else{
				System.out.print("Entrez un age valide supperieure a ZERO!!!");
			}
			
		}
		else {
			System.out.print("Entrez un genre valide!!!");
		}
		return res;
	}
	
	public static int etreMajeur(int age) {
		int res1 = -1;
		if(age > 0) {
			if(age>=18) {
				res1 = 1;
			}
			else if(age < 18){
				res1 = 0;
			}
		}
		return res1;
	}
	
	
	public static int  etreHomme(String genre) {
		int res2 = -1 ;
		if((genre == "homme")||(genre == "h")) {
			res2 =  0;
		}
		else if((genre == "femme")||(genre == "f")) {
			res2 = 1;
		}
		return res2;
	}
	
	public static int  etreHomme1(char genre) {
		int res2= -1;
		if((genre == 'H')||(genre == 'h')) {
			res2 = 1;
		}
		else if((genre == 'F')||(genre == 'f')) {
			res2 = 0;
		}
		return res2;
	}
	
	
	public static void main(String[] args) {
		char genre;
		int age;
		Scanner  inputAge = null;
		Scanner  inputGenre =null;
	
		
		try {
			inputGenre  = new Scanner(System.in);
			inputAge = new Scanner(System.in);
			
			System.out.println("Entrez 'H/h' pour Homme et 'F/fss' pour Femme");
			genre = inputGenre.next().charAt(0);
			
			System.out.println("Entrez votre age:");
			age = inputAge.nextInt();
			
			
		}
		finally {
		    if((inputGenre!=null)||(inputAge!=null)) {
		    	inputGenre.close();
		    	inputAge.close();
		    }
		}
		
		System.out.println(traitementGenreAge(genre, age));
		
	}
	

}
