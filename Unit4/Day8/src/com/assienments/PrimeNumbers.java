package com.assienments;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9} ;
		int[] result = primeNumber(numbers) ;
		if(result == null || result.length == 0  ) {
			System.out.println("Prime number not found in the supplied array");
		}
		else {
			for(int i : result) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static int[] primeNumber(int[] arr) {
	if(arr != null) {
		List<Integer> primeNum = new ArrayList<>() ;
		for(int i=0;i<arr.length ;i++) {
			int n = arr[i] ;
			int count = 0 ;
			for(int j = 2 ;j< n;j++) {
				if(n%j == 0) {
					count++ ;
					break ;
				}
			}
			if(count==0) {
				primeNum.add(n) ;
			}
		}
		
		int[] result = new int[primeNum.size()] ;
		for(int i=0;i<primeNum.size() ;i++) {
			result[i] = primeNum.get(i);
		}
		return result ;
	}
	else
	{
		System.out.println("null value is not allowed");
		return arr ;
	}
	
	}
	
}
