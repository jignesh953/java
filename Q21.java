package com.assignments;

class PrintNumber{
	
	
	public void printn(int n) {
		System.out.println("number is integer "+n);
	}
	public void printn(long n) {
		System.out.println("number is long "+n);
		
	}
	public void printn(float n) {
		System.out.println("number float is "+n);
		
	}
	public void printn(double n) {
		System.out.println("number is double "+n);

	}
}

public class Q21 {
public static void main(String[] args) {
	PrintNumber ob = new PrintNumber();
	ob.printn(19000);
	ob.printn(19000l);
	ob.printn(19000.4434f);
	ob.printn(190.45545433232323d);
}
}
