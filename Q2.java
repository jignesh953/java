package com.assignments;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the character");
	String ch = scanner.next();
	scanner.close(); // to remove scanner warning
	if(ch.length()>1) {
		System.out.println("Invalid Input");
	}
	
	else {
		if(ch.charAt(0)== 'a' || ch.charAt(0)== 'i' || ch.charAt(0)== 'o' || ch.charAt(0)== 'e' || ch.charAt(0)== 'u' || ch.charAt(0)== 'A' || ch.charAt(0)== 'E' || ch.charAt(0)== 'I' || ch.charAt(0)== 'O' || ch.charAt(0)== 'U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonants");
		}
	}
	
	
}
}
