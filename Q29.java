package com.assignments;


abstract class Parent1{
	public void message() {
	System.out.println("this is parent class");
}
}
class FirstSub extends Parent{
	public void message() {
		System.out.println("this is FirstSub class");
	}
}
class SecondSub extends FirstSub{
	public void message() {
		System.out.println("this is SecondSub class");
	}
}
public class Q29 {
public static void main(String[] args) {

	SecondSub objSecondSub = new SecondSub();
	objSecondSub.message();
	FirstSub objFirstSub = new FirstSub();
	objFirstSub.message();

}
}
