package com.assienments;
import java.util.*;
public class SumOfColumns {
	
	public static void sumOfColumns(int[][] arr) {
		
		for(int i=0;i<arr[0].length;i++) {
			int sum = 0 ;
			for(int j=0;j<arr.length ;j++) {
				
				if(arr[j][i]%2==0) {
					sum += arr[j][i] ;
				}
			}
			
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number of Rows");
		int n = sc.nextInt() ;
		System.out.println("Enter the number of Columns");
		int m =sc.nextInt() ;
		int[][] arr = new int[n][m] ;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("Enter next Number");
				arr[i][j] = sc.nextInt() ;
				
			}
		}
		System.out.println("=======================================");
		System.out.println("And the Result is ");
		System.out.println("=======================================\n");

		sumOfColumns(arr);
	}
}
