package com.assignments;

import java.util.Scanner;

public class Q16 {
public static void main(String[] args) {
	String first ="topsint.com";
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Enter the second string");
	String second = scanner.next();
	scanner.close();//warning removed
	
    boolean result=first.equals(second);
	System.out.println(result);
}
}
