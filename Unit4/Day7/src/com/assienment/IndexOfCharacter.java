package com.assienment;
import java.util.Scanner;
public class IndexOfCharacter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the String"); 
		String str =  sc.nextLine() ;
		System.out.println("Enter the index of the Character you want to find");
		int index = sc.nextInt() ;
		
		for(int i=0;i<str.length();i++) {
			if(i== index) {
				System.out.println("The character at " +i+"th index is \n"+ str.charAt(i));
			}
		}
		
	}
}
