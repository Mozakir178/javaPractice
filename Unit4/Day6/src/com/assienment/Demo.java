package com.assienment;

public class Demo {
int i ;
String s ;
float f ;

Demo(){
	this(10) ;
	System.out.println("Used all the constructer");
}
Demo(int i){
	this("String") ;
	this.i =i ;
	System.out.println(i);
}
Demo(String s){
	this(50.56f) ;
	this.s = s ;
	System.out.println(s);
}

Demo(float f){
	this.f = f ;
	System.out.println(f);
}

public static void main(String[] args) {
	Demo d1 = new Demo() ;
	
}
}
