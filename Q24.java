package com.assignments;

class Parent{
	public void parentDisplay() {
		System.out.println("This is parent class");
	}
}
class Child extends Parent{
	public void childDisplay() {
		System.out.println("this is child class");
	}
}

public class Q24 {
public static void main(String[] args) {
	Parent objParent = new Parent();
	Child objChild = new Child();
	
	objParent.parentDisplay();
	objChild.childDisplay();
	objChild.parentDisplay();
	
}
}
