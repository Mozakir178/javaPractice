package com.assienment.problem3;

public class Main {
	 
	public static void main(String[] args) {
		
		
		Loan loan = Loan.getLoan() ;
		
		double permanantEmployeeLoan = loan.calculageLoanAmount(new PermanantEmployee( 123 , "Nishat banayit" , 60000)) ;
		double temporaryEmployeeLoan = loan.calculageLoanAmount(new TemporaryEmployee(456, "Ajit Kumar" , 200 , 150)) ;
		
		System.out.println("Amount for the Permanant Employee : " + permanantEmployeeLoan);
		System.out.println("Amount for the Temporary Employee : " + temporaryEmployeeLoan);
	}

}
