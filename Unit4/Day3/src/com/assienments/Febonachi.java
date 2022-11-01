 package com.assienments;
import java.util.* ;
import java.io.* ;

public class Febonachi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please Enter the number you want to find the fibonachi sum: ");
		int n = sc.nextInt() ;
		int febNumWithoutRecursion = febNum(n) ;
		int febNumWithRecursion = febNumWithRec(n) ;
		
		System.out.println("Sum of "+n+"th Febbonachi Number without using Recursion method is: "+febNumWithoutRecursion);
		System.out.println("Sum of "+n+"th Febbonachi Number using Recursion method is: "+febNumWithRecursion);
	}
	
	public static int febNum(int n) {
		if(n<=1){
			return n ;
		}
		int sum1 = 0 ;
		int sum2 = 1 ;
		int temp=0 ;
		
		for(int i=2;i<=n;i++) {
			temp = sum1+sum2 ;
			sum1 = sum2 ;
			sum2 = temp ;
		}
		
		return temp ;
		
		
	}
	
	public static int febNumWithRec(int n) {
		if(n<=1) {
			return n ;
		}
		
		return febNumWithRec(n-1) + febNumWithRec(n-2) ;
	}

}
