package com.assienment.problem3;

public class PermanantEmployee extends Employee {
	
	private double basicPay ;
	
	public PermanantEmployee() {
	} 
	
	public PermanantEmployee( int employeeId , String employeeName , double basicPay) {
		super(employeeId , employeeName) ;
		this.basicPay = basicPay  ;
	}
	@Override
	public void calculateSalary() {
		double pfAmount = basicPay * 0.12 ;
		double result = basicPay  - pfAmount  ;
		this.setSalary(result);
	
	}
	
	public double getBasicPay() {
		return this.basicPay ;
	}

}
