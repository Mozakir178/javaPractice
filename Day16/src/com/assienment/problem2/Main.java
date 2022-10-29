package com.assienment.problem2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Set<Employee> employees = new TreeSet<>() ;
		System.out.println("Enter the details of 4 Employee\n=============================================\n");
		for(int i=1;i<5;i++) {
			System.out.println("Enter the Details of Employee "+i+"=============================================");
			System.out.println("Enter Employee Id:");
			int empId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("Enter the Emloyee Name:");
			String empName = sc.nextLine() ;
			System.out.println("Enter the Emloyee Salary:");
			double salary = sc.nextDouble() ;
			Employee emp = new Employee(empId, empName, salary)  ;
			employees.add(emp) ;
		}
		System.out.println("Details of 4 Employee Sorted by Salary\n=============================================\n");
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
