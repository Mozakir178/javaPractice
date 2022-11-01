/*
Q4) Explain why the following block of code will give a compile time error?
public class Main {
public static void main(String[] args) {
float f=3.3;
System.out.println(f);
}
}
Also rectify this code.
*/


/*Ans)
	In the above mention code when we are declearing the float variable we can not directly write it.
	Because every real number is consider as the double number in the JAVA language. Even still we want to do this then we need to explicitly tell compiler to change it.
	and to do so we need to do Explicit type casting here.
*/
package com.assienments;

public class Float {

	public static void main(String[] args) {
		
		/*
		 * float f=3.3;
		 * this will give error because of type casting
		 * System.out.println(f);
		 * for the solution we can do explicit type casting.
		 */
		
		float f = 3.3f ;
		System.out.println(f);
		int febNum = Febonachi.febNumWithRec(3) ;
		System.out.println(febNum);
		
		StringBuilder s1 = new StringBuilder("INDIA") ;
		StringBuilder s2 = new StringBuilder("INDIA") ;
		System.out.println(s1.equals(s2));

	}
	
	
}
