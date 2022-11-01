package com.masai;

public class Static {

	static int x = 50 ;
	int y = 30 ;
	static void staticVariable() {
		System.out.println("Inside the class Static whrer one static int is present with value "+x);
		
	}
	
	public static void main(String[] args) {
		staticVariable() ;
		
		Static obj = new Static() ;
		System.out.println(obj.x);
		obj = null ;
		System.out.println(obj);
//		System.out.println(obj.y); Here NullPointerException error will through by JVM
		System.out.println(obj.x);
		Indian.printDetails();
	}
}

class Indian{
	static String nationality = "Indian"  ;
	static String state = "Maharashtra" ;
	public static void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Nationality is "+nationality +"\n"+"State is "+state);
	}
}
