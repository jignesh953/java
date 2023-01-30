package com.assignments;

import java.util.Scanner;

public class Q39 {
	
	public void validate(int a) {
		
		if(a<18)
			throw new ArithmeticException("not valid");
		
	}
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your age");
	int a =scanner.nextInt();
	scanner.close();
	Q39 e1=new Q39();
	try {
		e1.validate(a);
		System.out.println("you are smart");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
