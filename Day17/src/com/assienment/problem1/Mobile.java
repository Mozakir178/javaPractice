package com.assienment.problem1;

import java.util.Scanner;

public class Mobile {
	OutdetedModel[] model = OutdetedModel.values() ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter the compony name and model number : ");
		String modelName = sc.nextLine() ;
		
		Mobile mobile = new Mobile() ;
		mobile.searchOutdatedModel(modelName);
		sc.close(); 
		
	}
	
	public void searchOutdatedModel(String componyName) {
		
		OutdetedModel mod = OutdetedModel.valueOf(componyName.toUpperCase()) ;
		
		for( OutdetedModel out : model) {
			if(out.equals(mod)){
				System.out.println(mod+"_OUTDATED");
			}
		}
	}
	
}
