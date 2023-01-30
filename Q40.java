package com.assignments;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAccount extends Exception{
	int a;
	public InvalidAccount(int a) {
		this.a=a;
	}
}
public class Q40  {
	
	
	public void validate(int a,int balance) throws InvalidAccount {
		if (a>balance) {
			throw new InvalidAccount(a-balance);
		}
		else 
			System.out.println("debited remaining balance is "+(balance -a));
	}
	
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the balance");
	int balance = scanner.nextInt();
	System.out.println("enter the Amount");
	int a =scanner.nextInt();
	scanner.close();
	Q40 e1=new Q40();
	
	try {
	e1.validate(a,balance);
	} catch (InvalidAccount e) {
		
		System.out.println("insufficient balance you need more "+e.a);
		e.printStackTrace();
	}
}
}
