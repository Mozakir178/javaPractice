package com.masai;

public class Lion {
	 String name ;
	 boolean isHungry ;
	 int age ;
	 static int totalDeath ;
	 static void printKilling() {
		 System.out.println("Total killing by lion in jungle = "+totalDeath);
	 }
	 void thinking( boolean isHungry , int age , String name) {
		 if(!isHungry) {
			 System.out.println(name +" is sleeping");
		 }
		 if(isHungry && age>2 && age<=12) {
			 totalDeath += 1 ;
			 System.out.println(name +" Has killed one animal") ;
		 }
		 if(isHungry && age>12) {
			 totalDeath += 2 ;
			 System.out.println(name+ " Has killed two animal") ;
			 
		 }
		 if(isHungry && age<2) {
			  System.out.println(name +" is calling Mom") ;
		 }
	 }
	 
	 public static void main(String[] args) {
		 
		 { 
			 Lion lion1 = new Lion() ;
			 lion1.name = "Simba" ;
			 lion1.age = 8;
			 lion1.isHungry = true ;
			 lion1.thinking(lion1.isHungry , lion1.age , lion1.name); 
		 }
		 
		 {
			 Lion lion2 = new Lion() ;
			 lion2.name = "Mufasa" ;
			 lion2.age = 30 ;
			 lion2.isHungry = false ;
			 lion2.thinking(lion2.isHungry , lion2.age , lion2.name); 
			 
			 
		 }
		 
		 {
			 Lion lion3 = new Lion() ;
			 lion3.name = "Scar" ;
			 lion3.age = 35 ;
			 lion3.isHungry = true ;
			 lion3.thinking(lion3.isHungry, lion3.age, lion3.name);
		 }
		 
		 
		 printKilling() ;
	 }
}
