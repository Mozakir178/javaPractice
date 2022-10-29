package com.assienment.problem1;

import java.util.Comparator;

class SortingProductPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return (int) (o1.getProductPrice() - o2.getProductPrice()) ;
	}
	
}

class SortingProductName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductName().compareTo(o2.getProductName()) ;
	}
	
}

class SortingProductId implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductId() - o2.getProductId() ;
	}
	
}
