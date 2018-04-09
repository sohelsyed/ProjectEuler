package com.sohel.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SmallestNo5 {

	static int count = 20;
	
	public static void main(String []args){
		
		int total = 2;
		
		int i = 2;
		while (i <= count){
			total = multiplyBySmallerNoPossible(total, i);
			i ++;
		}
			
		System.out.println(total);
	}

	private static int multiplyBySmallerNoPossible(int total, int no){
		for (int i=1;i <= count; i++){
			if ((total*i)%no==0){
				return total*i;
			}
		}
		
		return 0;
	}

}
