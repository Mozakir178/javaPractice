package com.assienment;

public class Main {
	public static void main(String[] args) {
		
		Students s1 = new Students(683,"Zakir" , 24, 490) ;
		
		Students s2 = new Students() ;
		s2.setAge(40);
		s2.setMarks(400);
		s2.setName("Rajesh");
		s2.setRoll(347);
		
		System.out.println("First Student's Details ");
		
		System.out.println("Roll NO : "+s1.getRoll());
		System.out.println("Name : "+ s1.getName());
		System.out.println("Age : "+s1.getAge());
		System.out.println("Marks : "+s1.getMarks() +"\n");
		
		System.out.println("Second Student's details"); 
		System.out.println("Roll NO : "+s2.getRoll());
		System.out.println("Name : "+ s2.getName());
		System.out.println("Age : "+s2.getAge());
		System.out.println("Marks : "+s2.getMarks() +"\n");
		
	}
}
