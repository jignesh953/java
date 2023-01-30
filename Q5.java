package com.assignments;

import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
	int sum=0,average;
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the numbers");
	for (int i = 0; i < 5; i++) {
		int a = scanner.nextInt();
		sum+=a;
	}
	//to remove scanner warning 
	scanner.close();
	
	average=sum/5;
	
	System.out.println("sum is " +sum+" average is "+average);
}
}
