package com.atelier_2.app;
import java.util.ArrayList;

public class boucle_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i ;
		String res="";
		
		ArrayList<Integer> array1 = new ArrayList<>();
		ArrayList<Integer> array2 = new ArrayList<>();
		ArrayList<Integer> array3 = new ArrayList<>();
		
		//remplissage array1 [1,10]
		
		for(i=0;i<10;i++) {
			array1.add(i+1);
		}
		
		//remplissage array2 [100,92]
		for(i=0 ; i<10;i++) {
			array2.add(100-i);
		}
		
		// remplissage array3
		for(i=0;i<array1.size();i++) {
			array3.add(array1.get(i));
			array3.add(array2.get(i));
		}
		
		//affichage resulat 
		for(i=0;i<array1.size();i++) {
			if(i < array1.size()-1) {
				res+= array1.get(i)+", "+ array2.get(i)+", ";
			}
			else
				res += array1.get(i);
			
		}
		System.out.print(res);
	}

}
