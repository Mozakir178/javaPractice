package com.assienment.problem4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Wages {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please Enter the start date in the format of dd-MM-yyyy") ;
		String start  = sc.next() ;
		System.out.println("Please Enter the end date in the format of  dd-MM-yyy") ;
		String end = sc.next() ;
		sc.close(); 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy") ;
		try {
			LocalDate startDate =LocalDate.parse(start , format) ;
			LocalDate endDate = LocalDate.parse(end , format) ;
			int days = (int) ChronoUnit.DAYS.between(startDate, endDate) ;
			if(days <0) {
				System.out.println("Start day should be before end Day");
			}
			else {
				int totalWage = days * 1200 ;
				System.out.println("Your Total Wage if "+totalWage);
			}
		}
		catch (Exception e) {
			System.out.println("Please enter date in dd-MM-yyy format");
		}
	}

}
