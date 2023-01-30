package com.assignments;

abstract class Bank{
	abstract public void getBalance();
	
}
class BankA extends Bank{
	public void getBalance() {
		System.out.println("This is Bank A");
	}
}
class BankB extends BankA{
public void getBalance() {
		System.out.println("This is Bank B");
	}
}
class BankC extends BankB{
public void getBalance() {
		System.out.println("This is Bank C");
	}
}

public class Q30 {
 public static void main(String[] args) {
	 BankA oBankA = new BankA();
	 BankB oBankB = new BankB();
	 BankC oBankC = new BankC();
	 oBankA.getBalance();
	 oBankB.getBalance();
	 oBankC.getBalance();
}
 
 
}
