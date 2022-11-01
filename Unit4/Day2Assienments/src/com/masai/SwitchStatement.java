package com.masai;
import java.util.* ;
public class SwitchStatement {

	public static void main(String[] args) {
	 	
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter City Name: ");
		String city = sc.nextLine();
		sc.close();
		SwitchFn(city) ;

	}
	
	public static void SwitchFn(String city) {
		
		switch (city) {
		case "Mumbai" : 
			System.out.println("Financial city");
			break ;
		case "Kolkata" :
			System.out.println("City of Joy"); 
			break ;
		case "Delhi" :
			System.out.println("Capital of the country");
			break  ;
		case "Bangalore" :
			System.out.println("Cyber City");
			break ;
		default :
			System.out.println("May be Other Indian City");
			break ;
	}
  }

}
