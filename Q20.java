package com.assignments;

import java.util.Scanner;



public class Q20 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the string");
	String ch=scanner.next();
	scanner.close();
	int[]arr=new int[256];
	
	for (int i = 0; i < ch.length(); i++) {
		arr[ch.charAt(i)]++;
		
	}
	int firstHighest=0;
	int secondHighest=0;
	
	for (int i = 0; i < 256; i++) {
		
		if(arr[i]>arr[firstHighest]) {
		
			secondHighest=firstHighest;
			firstHighest=i;
		}
		else if (arr[i] > arr[secondHighest] &&
                arr[i] != arr[firstHighest])
           secondHighest = i;
			
	}
	
	System.out.println((char)secondHighest);
	
}
}
