package com.assienments;
import java.util.* ;

public class GeometricSeriesSum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in) ;
		 double r = sc.nextInt() ;
		 double n = sc.nextInt() ;
		 
		 double result = GeoSeriesSum(n,r) ;
//		 BigDecimal Output= new BigDecimal(result).setScale(4) ;
//		 double d = Math.round(result * 10000);
		 
		 System.out.printf("%.4f" ,result);
		 
//		 System.out.println(r+" "+n);
	}
	
	public static double GeoSeriesSum(double n , double r) {
		if(n==0) {
			return 1 ;
		}
		
		return (1/Math.pow(r, n)) + GeoSeriesSum(n-1 , r) ;
	}
	
	
}
