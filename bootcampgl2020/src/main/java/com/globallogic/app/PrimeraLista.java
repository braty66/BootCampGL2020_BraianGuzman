package com.globallogic.app;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main(String[] args) {
	
		List<String> letters = new ArrayList<String>();
		
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		System.out.println(letters + " " + letters.size());
		
		letters.add(0, "X");
		
		System.out.println(letters + " " + letters.size());
		
		//String[] letters= {"X","A","B","C"};
		
		//for (int i= 0;  i<letters.length ; i++) {
			//System.out.println(letters[i]);
			
		}
		
		
		//System.out.println(letters.length);

	}

//}
