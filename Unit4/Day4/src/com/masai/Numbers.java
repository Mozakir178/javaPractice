package com.masai;

public class Numbers {
	void PrintNumbers(int n) {
		if(n<0) {
			System.out.println("Error");
		}
	    else if(n%2==1) {
			System.out.println( n);
		}
		else if(n%2==0) {
			System.out.println(n+(10-(n%10)));
		}
	}
	
	public static void main(String[] args) {
		
		Numbers n1 = new Numbers() ;
		n1.PrintNumbers(92);
		n1.PrintNumbers(53);
		n1.PrintNumbers(-10);
		
	}
}
