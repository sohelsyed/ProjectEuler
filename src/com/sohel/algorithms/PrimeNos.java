package com.sohel.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrimeNos {

	public static void main (String []args) {
		
		long VAL = 200; 
		
		List<Integer> primeNos = new ArrayList<>();
		primeNos.add(2);
		
		for (long i = 3 ; i < VAL ; i++) {
			boolean divisible = false;
				
			for (Integer prime: primeNos){
				if (i%prime==0){
					divisible = true;
					break;
				}
				
			}
			if (!divisible){
				System.out.println("Adding Prime No:"+i);
				primeNos.add((int)i);
			}	
		}
		
	}

}
