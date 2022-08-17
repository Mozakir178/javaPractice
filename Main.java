package com.evaluation.problem1;

public class Main {

	public static void main(String[] args) {
		
		Object[] arr = { new Student(23,"rakesh" , 450) , new Employee(12, "Lokesh" , 84000) , "String" , 50} ;
			Main obj = new Main() ;
			
			Object[] result = obj.changeArray(arr) ;
			for(int i=0;i<arr.length;i++) {
				System.out.println(result[i] );
			}
	}
	public Object[] changeArray(Object[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Student) {
				Student student = (Student) arr[i] ;
				int marks = student.getMarks()+10 ;
				student.setMarks(marks);
				arr[i] = student ;
			}
			
			else if(arr[i] instanceof Employee) {
				Employee employee = (Employee) arr[i] ;
				double salary = employee.getSalary()+10000 ;
				employee.setSalary(salary);
				arr[i] = employee ;
			}
			
			else if(arr[i] instanceof String) {
				String str = (String) arr[i] ;
				String s1 = "" ;
				
				for(int j= str.length()-1 ; j>=0;j--) {
					s1 += str.charAt(j) ;
				}
				arr[i] = s1 ;
			}
			else {
				int value = (int) arr[i] +20;
				arr[i] = value ;
			}
		}
		
		
		
		return arr ;
	}
}
