package com.assignments;

abstract class Shape{
	abstract public void rectangleArea(int a,int b);
	abstract public void squareArea(int a);
	abstract public void circleArea(int a);
	
}

class Area1 extends Shape{
	public void rectangleArea(int a,int b) {
		System.out.println("Area of Rectangle is "+a*b);
	}
	public void squareArea(int a) {
		System.out.println("Area of square is "+a*a);
	}
	public void circleArea(int a) {
		System.out.println("Area of circle is "+3.14*a*a);
	}
}

public class Q33 {
public static void main(String[] args) {
	Area1 objArea =new Area1();
	objArea.rectangleArea(5, 6);
	objArea.squareArea(5);
	objArea.circleArea(5);
}
}
