package com.assienment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to add into the List");
		ArrayList<String> list = new ArrayList<>() ;
		int count = 1 ;
		while(true ) {
			System.out.println("Enter String no " + count++);
			list.add(sc.next()) ;
			System.out.println("want to add more : y/n");
			if(sc.next().equalsIgnoreCase("n")) {
				break ;
			}
		}
		sc.close() ;
		
		System.out.println("Printing list directly");
		System.out.println(list) ;
		System.out.println("================================================\n");
		
		System.out.println("Printing list using inhance for loop");
		for(String s : list) {
			System.out.print(s+" -- ");
		}
		System.out.println();
		System.out.println("================================================\n");
		
		System.out.println("Printing list using normal for loop");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" - ");
		}
		System.out.println();
		System.out.println("================================================\n");

		System.out.println("Printing using Itrator");
		
		ListIterator<String> itrate =  list.listIterator()  ;
		
		while(itrate.hasNext()) {
			System.out.print(itrate.next()+" --- ");
		}
		System.out.println();
		System.out.println("================================================\n");


	}

}
