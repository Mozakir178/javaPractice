package com.assienment.problem4;
import java.util.*; 
public class Main {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>() ;
		Scanner sc = new Scanner(System.in) ;
		int employeeNo = 1 ;
		while(true) {
			System.out.println("Do you want to Enter the detail of Employee ? (Y?N)");
			String permision = sc.next() ;
			if(permision.equalsIgnoreCase("N")) { 
				System.out.println("\nThank You");
				break ;
			}
			
			System.out.println("Enter the Employee Details: "+ employeeNo++ +"\n========================================\n");
			System.out.println("Enter the Employee Id: ");
			int employeeId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("Enter the Employee Name: ");
			String employeeName = sc.nextLine() ;
			System.out.println("Enter the Employee Salary: ");
			double employeeSalary = sc.nextDouble() ;
			System.out.println("Enter the Employee Department Id: ");
			int employeeDepatmentId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("Enter the Employee Department Name: ");
			String employeeDepartmentName = sc.nextLine() ;
			
			Employee employee = new Employee(employeeId, employeeName, employeeSalary, employeeDepatmentId, employeeDepartmentName) ;
			
			employees.add(employee) ;
			System.out.println("Employee Details added successfully.");
		}
		
		while(true ) {
			System.out.println("Enter your choice: \n1. Find Employee in Particular Dpartment \n2.Remove Paarticular Employee \n3.Print Employees in All Departments");
			
			int choice = sc.nextInt() ;
			if(choice ==1) {
				System.out.println("Enter the Department Id: ");
				int departmentId = sc.nextInt() ;
				
				for(Employee employee : employees) {
					if(employee.getDepartment().getDepartmentId() == departmentId) {
						System.out.println(employee);
						System.out.println("==================================");
					}
				}
			}
			else if(choice == 2) {
				System.out.println("Enter the Employee Id: ");
				int employeeId = sc.nextInt() ;
				for(int i=0;i<employees.size() ;i++) {
					if(employees.get(i).getEmployeeId() == employeeId) {
						employees.remove(i) ;
						System.out.println("Employee removed successfully: ");
						System.out.println("==================================");

					}
				}
			}
			
			else if(choice == 3) {
				for(Employee employee : employees) {
					System.out.println(employee);
					System.out.println("==================================");

				}
			}
			else {
				System.out.println("Enter proper number");
			}
			System.out.println("Do you want to Exit ? (Y/N) ");
			String exit = sc.next() ;
			if(exit.equalsIgnoreCase("Y")) {
				System.out.println("\nThank You");
				break ;
			}
		}
		
		sc.close() ;
	}
}
