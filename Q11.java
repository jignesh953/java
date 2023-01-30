package com.assignments;

import java.util.Scanner;

public class Q11 {
	
public int add(int n) {
	int result;
	
	result=n+n*10+n+n*100+n*10+n;
	
	return result;
}

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = scanner.nextInt();
	scanner.close();// to remove scanner warning
	Q11 obj = new Q11();
	int c=obj.add(n);
	System.out.println(c);
	
}
}
