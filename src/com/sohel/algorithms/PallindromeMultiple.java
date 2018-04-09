package com.sohel.algorithms;

// Problem 4
public class PallindromeMultiple {

	public static void main(String[] args) {

		long res = 1;
		
		long lowerVal = 1;

		for (long i = 999; i > 99; i--) {
			if (i==lowerVal){
				break;// Unnecessary iterations
			}
			for (long j = i-1; j > 99; j--) {
				if (i * j > res && isPalindrome(i * j)) {
					res = i * j;
					lowerVal = j;
					continue;

				}
			}
		}

		System.out.println("VAL:" + res);

	}

	// 906609

	public static boolean isPalindrome(long no) {
		String s = String.valueOf(no);
		for (int i = 0; i < s.length(); i++) { // Make more effiecient
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}

}
