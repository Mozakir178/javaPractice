package com.assienments;
import java.util.*; 

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter total number of Student");
		int n = sc.nextInt() ;
		Students[] students = new Students[n] ;
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of Student No." +(i+1) +"\n" +"=============================");
			System.out.println("Enter Roll Number : ");
			int roll = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("Enter Name : ");
			String name = sc.nextLine() ;
			System.out.println("Enter Address : ");
			String address = sc.nextLine() ;
			System.out.println("Enter Marks : ");
			int marks = sc.nextInt() ;
			
			students[i]  = new Students(roll , name, address , marks) ;
		}
		int j = 1 ;
		int totalMarks = 0 ;
		for( Students i : students) {
			System.out.println("\n Details of Student No " + j+"\n====================================");
			System.out.println("Roll No of the Student No "+j+" : "+i.getRoll());
			System.out.println("Name of the Student No "+j+" : "+i.getName())	;
			System.out.println("Address of the Student No "+j+" : "+i.getAddress());
			System.out.println("Marks of the Student No "+j+" : "+i.getMarks());
			j++ ;
			totalMarks += i.getMarks() ;
		}
		System.out.println("\n ================================\n");
		double avarage = totalMarks / (students.length + 0.0) ;
		System.out.println("Avarage of total Marks is " + avarage);
	}
	
}
