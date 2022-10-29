package com.assienment.problem2;

import java.util.Scanner;

public class IPL {
	
	public void homeTeamStadium(Stadium stadium) {
		
		if(stadium == Stadium.CHIDAMBARAM_STADIUM) {
			System.out.println("This is the home ground of the RCB");
		}
		
		else if(stadium == Stadium.EDEB_GARDENS_STADIUM) {
			System.out.println("This is the home ground of the KKR");
		}
		
		else if (stadium == Stadium.M_CHINNASWAMY_STADIUM) {
			System.out.println("This is the home ground of the CSK");
		}
		else if(stadium == Stadium.WANKHADE_STADIUM) {
			System.out.println("This is the home ground of the MUMBAI INDIANS");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the full name of the stadium :");
		String stadiumName = sc.nextLine() ;
		sc.close(); 
		try {
			Stadium stadium = Stadium.valueOf(stadiumName.toUpperCase()) ;
			IPL ipl = new IPL() ;
			ipl.homeTeamStadium(stadium);
		}
		catch (Exception e) {
			System.out.println("Please Entet the correct name");
		}
	} 
}
