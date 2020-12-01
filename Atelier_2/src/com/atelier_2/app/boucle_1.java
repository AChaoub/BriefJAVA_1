package com.atelier_2.app;
import java.util.ArrayList;

public class boucle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i ;
			String res="";
			ArrayList<Integer> array1 = new ArrayList<>();
			
			for(i=0;i<10;i++) {
				array1.add(i+1);
				if(i!=9) {
					res+=array1.get(i)+", ";
				}
				else
					res+= array1.get(i);
				
			}
			
				System.out.print(res);
			
			
			
			
		
	}

}
