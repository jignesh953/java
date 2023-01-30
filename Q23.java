package com.assignments;

class Area{
	public void display(int n) {
		System.out.println("Area of Square is "+n*n);
	}
	public void display(int n,int m) {
		System.out.println("Area of Rectangle is "+n*m);

	}
}

public class Q23 {
	
	public static void main(String[] args) {
	
		Area ob= new Area();
		ob.display(4);
		ob.display(4, 5);
	
}
}
