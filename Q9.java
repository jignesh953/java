package com.assignments;

import java.util.Scanner;

public class Q9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the String");
	String ch = scanner.nextLine();
	
	scanner.close();// to remove scanner warning
	int letters=0,numbers=0,spaces=0,other_characterstics=0;
	for (int i = 0; i < ch.length(); i++) {
		
		if((ch.charAt(i)>='a' && ch.charAt(i)<='z')||ch.charAt(i)>='A' && ch.charAt(i)<='Z') {
			letters++;
		}else if (ch.charAt(i)>='0' && ch.charAt(i)<='9') {
			numbers++;
		}
		else if (ch.charAt(i)==' ') {
			spaces++;
		}
		else {
			other_characterstics++;
		}
		
	}
		System.out.println("Numbers of letters "+letters);
		System.out.println("Numbers of numbers "+numbers);
		System.out.println("Numbers of spaces "+spaces);
		System.out.println("Numbers of other_characterstics "+other_characterstics);
		
}
}
