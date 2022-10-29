package com.assienment.problem3;

public class Loan {
	
  private Loan() {
	  
}
	public double calculageLoanAmount(Employee employee) {
		
		if(employee instanceof PermanantEmployee) {
			PermanantEmployee permanantEmployee = (PermanantEmployee) employee ;
			permanantEmployee.calculateSalary();
			
			return permanantEmployee.getSalary() * 0.15 ;
		}
		else if (employee instanceof TemporaryEmployee) {
			TemporaryEmployee temporaryEmployee = (TemporaryEmployee) employee ;
			temporaryEmployee.calculateSalary(); 
			
			return temporaryEmployee.getSalary() * 0.10 ;
			
		}
		else {
			System.out.println("Not working");
			return 0 ;
		}
	}
	
	public static Loan getLoan() {
		return new Loan() ;
	}
	
	
}
