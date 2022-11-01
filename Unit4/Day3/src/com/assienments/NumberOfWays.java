package com.assienments;
import java.util.* ; ;
public class NumberOfWays {

	public static void main(String[] args) {
//		System.out.println("ok");
		int result ;
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Please enter the total number of the stire: " );
			int n = sc.nextInt() ;
		
		NumberOfWays sum = new NumberOfWays() ;
		result = numOfWays(n) ;
		System.out.println("The Number of possible ways to reach at the top are: ");
		System.out.println(result);
		
		
	}
	
	public static int numOfWays(int n) {
		if(n==0) {
			
			return 1 ;
		}
		if(n<0) {
			return 0 ;
		}
		
		return  numOfWays(n-1)+ numOfWays(n-2)+ numOfWays(n-3) ;
	}
}
