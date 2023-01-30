package com.assignments;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

@SuppressWarnings("serial")
class InvalidAge extends Exception{
	public InvalidAge(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}

@SuppressWarnings("serial")
class InvalidName extends Exception{
	public InvalidName(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}

class Student{
	int roll_no;
	String name;
	int age;
	String course;
	
	public Student(int roll_no,String name,int age,String course){
		this.roll_no=roll_no;
		this.name=name;
		this.age=age; 
		this.course=course;
		
	}
	public void validateAgeName() throws InvalidAge,InvalidName {
		if(!(age>=15 && age<=21)) {
			throw new InvalidAge("AgeNotWithinRangeException");
		}
		
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(name);
        boolean isStringContainsSpecialCharacter = matcher.find();
        if(isStringContainsSpecialCharacter)
            throw new InvalidName("NameNotValidException");
       
        
        System.out.print(roll_no+" "+name+" "+age+" "+course);
	}
	
	
	
	
}

public class Q41 {
public static void main(String[] args) {
	
	Student e1=new Student(14, "Adarsh", 21, "Btech");
	
	try {
		
		e1.validateAgeName();
	} catch (InvalidAge e) {
		
		System.out.println("Exception occured"+e);
	}
	catch (InvalidName e) {
		
		System.out.println("Exception occured"+e);
	}
	catch (Exception e) {
		
		System.out.println("Exception occured"+e);
	}
}
}
