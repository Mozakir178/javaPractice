package com.assienment.problem1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter details for creating new Product class object:");
		List<Product> products = new ArrayList<>() ;
		for(int i=1;i<=4;i++) {
			System.out.println("Ente the details of Product "+i+"\n========================================\n");
			System.out.println("Ener Product Id: ");
			int productId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("Enter Prduct Name: ");
			String productName = sc.nextLine() ;
			System.out.println("Enter Product Price: ");
			double productPrice = sc.nextDouble() ;
			Product product = new Product(productId, productName, productPrice) ;
			products.add(product) ;
		}
		SortingProductId sortById = new SortingProductId() ;
		SortingProductName sortByName = new SortingProductName() ;
		SortingProductPrice sortByPrice = new SortingProductPrice() ;
		System.out.println("Enter how you want to Sort \n1. Sort By Product Price. \n2. Sort By Product Name. \n3. Sort By Product Id. \n================================");
		int choice = sc.nextInt() ;
		sc.close(); 
		System.out.println("Products List before Sorting. \n========================================\n\n");
		for(Product p : products) {
			System.out.println(p);
		}
		if(choice == 1) {
			Collections.sort(products , sortByPrice);
		}
		else if(choice == 2) {
			Collections.sort(products , sortByName);
		}
		else {
			Collections.sort(products , sortById) ;
		}
		System.out.println("Products List after Sorting.  \n========================================\n");
		for(Product p : products) {
			System.out.println(p);
		}
	}
}
