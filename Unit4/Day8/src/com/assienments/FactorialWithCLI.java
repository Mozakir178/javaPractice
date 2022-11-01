package com.assienments;
import java.util.*;

public class FactorialWithCLI {

	public static void main(String[] args) {
		int n=0 ;
		boolean valid = true ;
		if(args.length ==1) {
			n = Integer.parseInt(args[0]) ;
					}
		else if(args.length == 2) {
			int n1 = Integer.parseInt(args[0]) ;
			int n2 = Integer.parseInt(args[1]) ;
			
			n = Math.abs(n1-n2) ;
		}
		else {
			 valid = false ;
		}
		
		if(valid) {
			int result = factorial(n) ;
			System.out.println("Factotrial of the number "+n+ " is "+result);

		}
		else {
			System.out.println("Error");
		}
		
		
	}
	
	public static int factorial(int number) {
		int fact = 1 ;
		for(int i=1;i<=number ;i++) {
			fact *= i ;
		}
		if(number<1) {
			return 0 ;
		}
		else {
			return fact ;
		}
	}
}
