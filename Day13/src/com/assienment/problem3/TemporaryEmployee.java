package com.assienment.problem3;

public class TemporaryEmployee extends Employee {

	
	private int hoursWorked ;
	private int hourlyWages ;
	
	public TemporaryEmployee() {
	}
	
	public TemporaryEmployee(int employeeId , String employeeName , int hourseWorked , int hourlyWages) {
		super(employeeId , employeeName) ;
		this.hoursWorked = hourseWorked ;
		this.hourlyWages = hourlyWages ;
	}
	@Override
	public void calculateSalary() {
		double salary = this.hourlyWages * this.hoursWorked ;
		this.setSalary(salary);
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	

}
