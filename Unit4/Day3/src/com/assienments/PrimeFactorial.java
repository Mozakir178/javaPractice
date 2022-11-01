package com.assienments;
import java.util.*;

public class PrimeFactorial {

	public static void main(String[] args) {
		int n = 12 ;
		String result = printPrimeFactorial(n) ;
		System.out.println(result);
	}
	
	public static String printPrimeFactorial(int n) {
		String res = "";
		for(int i=1 ;i<=n;i++) {
			if(n%i == 0 || i==1) {
				res += i+" " ;

			}
			
		}
		
		return res ;
	}

}
