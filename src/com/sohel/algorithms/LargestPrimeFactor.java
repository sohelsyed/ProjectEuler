package com.sohel.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

	public static void main(String[] args) {

		long VAL = 600851475143L;

		System.out.println("Val:"+ VAL);
		
		long largestDivisor = 1;
		
		for (int i=2; i < VAL+1; i++) {
			if (VAL % i == 0){
				VAL = VAL/i;
				largestDivisor = i;
			}
		}
		
		
		System.out.println("Largest Divisor:"+largestDivisor);
	}

}
