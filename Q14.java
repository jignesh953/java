package com.assignments;

import java.util.Scanner;

public class Q14 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The String");
	String ch = scanner.nextLine();
	System.out.println("Enter the Index");
	int c = scanner.nextInt();
	
	scanner.close();// to remove scanner warning
	
	System.out.println("The Character at position "+c+" is "+ch.charAt(c));
}
}
