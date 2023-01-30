package com.assignments;

import java.util.Scanner;

public class Q15 {
public static void main(String[] args) {
	String first ="Tops Technologies in ";
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the second string");
	String second = scanner.next();
	scanner.close();//warning removed
	
	first=first.concat(second);
	System.out.println(first);
}
}
