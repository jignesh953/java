package com.assignments;
class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void perimeter() {
	//	length=4;
		//breadth=5;
				
		System.out.println("Perimeter is "+2*(length+breadth));
	}
	public void area() {
		//length=5;
		//breadth=6;
		System.out.println("Ares is "+length*breadth);
	}
}

//class Square extends Rectangle{
	
//	public Square() {
	//	super(s, s);
		
	//}//
//}
class Square extends Rectangle{
	int s;
	public Square(int s) {
		
		super(s, s);
	}
}

public class Q26 {
public static void main(String[] args) {
	Square obj=new Square(6);
	obj.area();
	obj.perimeter();
	Rectangle obRectangle = new Rectangle(5, 6);
	obRectangle.area();
	obRectangle.perimeter();
	
}
}
