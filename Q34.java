package com.assignments;

import java.util.Scanner;

public class Q34 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the marks");
	int n =scanner.nextInt();
	scanner.close();
	
	if (n>91 && n<=100) {
		System.out.println("Grade A");
	}else if (n>81 && n<=90) {
		System.out.println("Grade B");
	}else if (n>71 && n<=80) {
		System.out.println("Grade C");
	}else if (n>61 && n<=70) {
		System.out.println("Grade D");
	}else if (n>51 && n<=60) {
		System.out.println("Grade E");
	}else if (n>41 && n<=50) {
		System.out.println("Grade F");
	}
	else {
		System.out.println("Fail");
		
	}
	
}
}
