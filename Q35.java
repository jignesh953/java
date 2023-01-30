package com.assignments;

class ShapeOne{

	public void display() {
		System.out.println("This is Shape");	}
	
}
class RectangleOne extends ShapeOne{
	public void rectangleDisplay() {
		System.out.println("This is Rectangle");
	}
}
class SquareOne extends RectangleOne{
	public void SquareDisplay() {
		System.out.println("Square is rectangle	");
	}
}
class Circle extends ShapeOne
{
	public void CircleDisplay() {
		System.out.println("This is Circle");
	}
}

public class Q35 {
public static void main(String[] args) {
	SquareOne obSquare=new SquareOne();
	obSquare.SquareDisplay();
	obSquare.rectangleDisplay();
}
}
