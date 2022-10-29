package com.assienment.problem3;

public abstract class Employee {
	
	private int employeeId ;
	private String employeeName ;
	private double salary ;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId  ;
	}
	
	public int getEmployeeId() {
		return this.employeeId ;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee() {
	}
	
	public Employee(int employeeId , String employeeName) {
		this.employeeId = employeeId  ;
		this.employeeName =employeeName  ;
	}
	
	public abstract void calculateSalary() ;

}
