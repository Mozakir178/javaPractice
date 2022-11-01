package com.assienments;

public class NuturalNumber {

	public static void main(String[] args) {
		int n = 5 ;
		int result = sumOfNaturalNumber(n) ;
		System.out.println(result);
	}
	
	public static int sumOfNaturalNumber(int n) {
		int sum = (n*(n+1))/2 ;
		return sum ;
	}

}
