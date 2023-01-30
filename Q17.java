package com.assignments;

import java.util.Scanner;

public class Q17 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first string");
	String first=scanner.nextLine();
	System.out.println("Enter the second string");
	String second=scanner.next();
	
	scanner.close();//warning removed
	
	boolean result=first.endsWith(second);
	System.out.println(result);
}
}
