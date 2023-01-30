package com.assignments;

class Triangle{
	int a=3;
	int b=4;
	int c=5;
	
	public void area() {
		System.out.println("area of triangle is "+ (a*b)/2);
		System.out.println("perimeter of triangle is "+ (a+b+c));
	}
}

public class Q27 {
public static void main(String[] args) {
	Triangle obj = new Triangle();
	obj.area();
}
}
