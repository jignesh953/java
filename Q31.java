package com.assignments;


abstract class Marks{
	abstract public void getPercentage();
}
class A extends Marks{
	int sub1;
	int sub2;
	int sub3;
	
	public A(int sub1,int sub2,int sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public void getPercentage(){
		System.out.println("Percentage of A "+((sub1+sub2+sub3)*100)/300);
	}
}
class B extends Marks{
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	
	public B(int sub1,int sub2,int sub3,int sub4) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	public void getPercentage(){
		System.out.println("Percentage of B "+((sub1+sub2+sub3+sub4)*100)/400);
	}
}
public class Q31 {
public static void main(String[] args) {
	A oA=new A(80, 80, 80);
	B oB=new B(55, 55, 75, 75);
	oA.getPercentage();
	oB.getPercentage();
}
}
