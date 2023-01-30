package com.assignments;

public class Q38 {
public static void main(String[] args) {
	
	try {
		int b=10,c=2;
		int a =b/c;
		System.out.println(a);
		
		
	//	int []arr=new int[5];
		int []arr =new int [5]; 
	// int b[]={1,2,3,4,5}	
		arr[5]=30/0;
		System.out.println(arr[0]);
		
		
//		String dString = null;
		String dString = "Adarsh";
		
		
		System.out.println(dString.toUpperCase());
		
	} catch (ArrayIndexOutOfBoundsException exception) {
		System.out.println("Array exception");
	}
	catch (ArithmeticException exception) {
	     System.out.println("Arithmetic exception");
	}	
	catch (NumberFormatException exception) {
		System.out.println("Number exception");
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("all exception covered");
	}
	
	//Exception 
}
}
