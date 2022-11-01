package com.masai;

public class Main {

	int num = 100 ;
	static int num2 = 200 ; 
	OOPS obj3 = new OOPS() ;
	
	void func1() {
		System.out.println("Inside the function func1 of Main class");
	}
	
	static void func2() {
		System.out.println("Inside the function func2 of Main class");
	}
	
	public static void main(String[] args) {
		func2() ;
		System.out.println(num2);
//		func1() ; this will give compiler error because nonstatic method can not be directly call in another method or class to use this method we need to create the object of that class.
		
		Main obj = new Main() ;
		//Here new object of Main class and it will be load in the heap area with all its varibales and method body and address.
		//Now we can access the non static variable and method of Main class with obj address.
		obj.func1();
		System.out.println(obj.num);
		//We can modify the value of variable of obj1 it will only effect the obj1 if we create another obj original value will be assign to that object.
		
		obj.num = 50;
		//it will change the value of num of obj1 to 50 ;
		System.out.println(obj.num);
		
		Main obj2 = new Main() ;
		//After creating the new object it will contain initial value of num not the changed value of num of obj.
		System.out.println(obj2.num);
		
		System.out.println(obj2.obj3.x);
//		System.out.println(OOPS.x); This will through error.
//		OOPS.nonStaticFunc() ; This will also through error because it is a non static method object creation is needed.
		obj2.obj3.nonStaticFunc();
		
		System.out.println(obj2.obj3.y +" Static variable can be called using object name like this");
		System.out.println(OOPS.y +" Static variable can be called directly using the class name also like this");
		OOPS.funcOOPS();
		
		Static.staticVariable() ;
		Static.x = 68 ;
		System.out.println(Static.x);
		
		
		
	}
}
