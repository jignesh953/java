package com.assignments;

import java.util.Scanner;

public class Q37 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter Two Numbers");	
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		scanner.close();
		
		try {
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
}
}
