package com.assienment;
import java.util.Scanner;

public class Course {
	
	int courseId  ;
	String courseName ;
	int courseFee ;
	
	Course(){
		
	}
	
	Course (int id, String name , int fee){
		this.courseId = id ;
		this.courseName = name ;
		this.courseFee = fee ;
	}
	
	public void displayCourseDetails() {
		System.out.println("Course ID : " + courseId);
		System.out.println("Course Name : "+ courseName);
		System.out.println("Course Fee : " + courseFee);
	}
	
	public static void authenticate( String username , int password) {
		
		if(username.equals("Admin") && password == 1234) {
			Scanner sc = new Scanner(System.in) ;
			System.out.println("Hello Admin Please provide Details of the course :");
			System.out.println("Enter ID of the course");
			int id = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("Enter Name of the course");
			String name = sc.nextLine() ;			
			System.out.println("Enter Fee of the course");
			int fee = sc.nextInt() ;
			System.out.println("Thank you for the information Details are as follow \n");
			Course course1 = new Course( id , name , fee) ;
			
			course1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("First User");
		authenticate("Admin" , 1234) ;
		
		System.out.println("\n Second User") ;
		authenticate("NormalUser" , 1111) ;		
	}
}
