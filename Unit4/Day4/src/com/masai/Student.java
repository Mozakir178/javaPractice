package com.masai;

public class Student {
	int roll ;
	String name ;
	int marks ;
	 
	void displayStudentDetails() {
		System.out.println("Roll is : "+this.roll);
		System.out.println("Name is : " +this.name );
		System.out.println("Marks is : "+this.marks);
	}
	
	public static void main(String[] args) {
		System.out.println("------------------------First Student---------------------------");

		{
			Student student1 = new Student() ;
			student1.roll = 683 ;
			student1.name = "Zakir" ;
			student1.marks = 499 ;
			student1.displayStudentDetails();
		}
		System.out.println("------------------------Second Student---------------------------");
		{
			Student student2 = new Student() ;
			student2.roll = 786 ;
			student2.name = "Mohammad" ;
			student2.marks = 500 ;
			student2.displayStudentDetails();
		}
	}
}
