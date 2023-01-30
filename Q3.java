package com.assignments;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year");
	int year = sc.nextInt();
	
	sc.close();//to remove scanner warning
	
	if((year%4==0 && year%100!=0) || year%400==0) {
		System.out.println("Leap year");
	}
	else {
		System.out.println("not a leap year");
	}
}
}
