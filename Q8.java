package com.assignments;

import java.util.Scanner;

public class Q8 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	int number1 = scanner.nextInt(); //number less then 10 billion is 
	//in the range of integer
	
	scanner.close();//to remove scanner warning
	int count = 0;
	int number = number1;
	while(number>0) {
		number/=10;
		count++;
	}
	
	System.out.println("Number of digits in "+number1 +" is "+ count);
	
}
}
