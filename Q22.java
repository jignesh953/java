package com.assignments;

class Print_Char_Number{
	public void display(int num,char ch) {
		System.out.println(num+" "+ch);
	}
	public void display(char ch,int num) {
		System.out.println(num+" "+ch);
	}
}

public class Q22 {
public static void main(String[] args) {
	Print_Char_Number object = new Print_Char_Number();
	object.display('c', 1998);
	object.display(1998, 'a');
}
}
