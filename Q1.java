package com.assignments;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	Scanner scObj = new Scanner(System.in);
	System.out.println("Enter the number a");
	int a = scObj.nextInt();
	System.out.println("Enter the number b");
	int b = scObj.nextInt();
	System.out.println("Enter the number c");
	int c = scObj.nextInt();
	
	if(a>b) {
		if(a>c) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
	else {
		if (b>c) {
			System.out.println("b is greater");
			
		}
		else {
			System.out.println("c is greater");
		}
	}
	
 
	/*
	 if (a>b && a>b) {
		System.out.println("greater is "+a);
	}else if (b>a && b>c) {
		System.out.println("grater is "+b);
	}else {
		System.out.println("greater is "+c);
	}
	 */

	scObj.close();
}

}
