package com.assignments;

import java.util.Scanner;

public class Q10 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the character");
	char ch=scanner.next().charAt(0);
	
	scanner.close();// to remove scanner warning
	
	int num = (int)ch;
	System.out.println("The ASCII value pf given character is "+num);
	
}
}
