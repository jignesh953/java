package com.assignments;

class Members{
	String Name="Adarsh";
	int Age=24;
	long Phone_Number=9962146456l;
	String Address="Surat";
	int Salary=40000;
	
	
	public void printsalary() {
		System.out.println("salary is "+Salary);
	}
}
public class Q25 {
public static void main(String[] args) {
	Members obj=new Members();
	obj.printsalary();
}
}
