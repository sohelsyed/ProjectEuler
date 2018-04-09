package com.sohel.algorithms;

public class EvenFibonacci {

	public static void main (String []args){
		
		// Add evens 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ..
		
		long MAX = (long) 4e6; // 4 million
		System.out.println("Max:"+MAX);
		
		
		long a = 1;
		long b = 2;
		
		long evenTotal = 2;
		
		while ( a + b < MAX ){
			long c = a + b;
			if (c%2 == 0 ){
				evenTotal+=c;
			}
			
			a = b;
			b = c;
		}
		
		System.out.println("Even Total:"+evenTotal);
	}

}
