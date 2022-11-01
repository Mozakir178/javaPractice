package com.assienment;

public class Student {
 int roll ;
 String name ;
 String address ;
 String collageName ;
 
 Student(int roll , String name , String address, String collageName){
	 this.roll = roll ;
	 this.name = name ;
	 this.address = address ;
	 this.collageName = collageName ;
 }
 
 Student(int roll , String name , String address){
	 this.roll = roll ;
	 this.name = name ;
	 this.address = address ;
	 this.collageName = "NIT" ;
	 
 }
 

 
 public static Student getStudent(boolean isFromNIT) {
	 
	 if(isFromNIT) {
		 Student student1 = new Student(100,"Mohammad Zakir" , "Kapustalni" ) ;
		 return student1 ;
	 }
	 else {
		 Student student1 = new Student(153,"Rajesh Gawande" , "Amravati" , "K.G.I.E.T") ;
		 return student1 ;
	 }
	
	 
 }
 
 public static void main(String[] args) {
	Student student =  getStudent(true) ;
	System.out.println("        First Student");
	System.out.println("Student Name : "+ student.name);
	System.out.println("Student Roll : "+ student.roll);
	System.out.println("Student Address : "+ student.address);
	System.out.println("Student Collage : "+ student.collageName);
	
	 System.out.println("\n     Second Student");
	 Student student1 =  getStudent(false) ;
	 System.out.println("Student Name : "+ student1.name);
		System.out.println("Student Roll : "+ student1.roll);
		System.out.println("Student Address : "+ student1.address);
		System.out.println("Student Collage : "+ student1.collageName);
		
 }
}
