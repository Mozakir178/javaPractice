package com.assienments;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter the string you want to reverse : ");
		String originalString = sc.nextLine() ;
		String result = reverseString(originalString) ;
		System.out.println("Original Sting you have entered is : "+ originalString);
		System.out.println("String after reverse is : "+ result);
		
		
	}
	
	public static String reverseString(String input) {
		char[] arr = new char[input.length() ] ;
		int j = 0 ;
		for(int i=input.length()-1  ; i>=0 ;i--) {
			arr[j++] = input.charAt(i) ;
		}
		String res = new String(arr) ;
		return res ;
	}
}
