package com.assignments;

import java.util.Scanner;

public class Q32 {
	
	public int factorial(int n) {
		
		
		if(n==0)
			return 1;
		return n*factorial(n-1);
		
		
	}
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number for factorial");
	int n=scanner.nextInt();
	scanner.close();
	
	Q32 ob=new Q32();
	int number=ob.factorial(n);
	System.out.println(number);
}
}
