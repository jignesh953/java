package com.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q47_Q56 {
public static void main(String[] args) {
	ArrayList<String> s1=new ArrayList<String>();
	s1.add("red");
	s1.add("Yellow");
	s1.add("orange");
	s1.add("blue");
	s1.add("green");
	s1.add("white");
	s1.add("grey");
	s1.add(String.valueOf("vibgyor"));
	
	
	System.out.println(s1);
//------------------------------------------------------------------	
	Iterator<String> it=s1.iterator();  //Q48
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
//------------------------------------------------------------------	
	s1.add(0, "colors");     //Q49
	s1.add(1, "violet");

	System.out.println(s1.get(7)); //Q50
	
	
//------------------------------------------------------------------	
	s1.set(4, "safron");
	System.out.println(s1); //Q51
	
//------------------------------------------------------------------	

	s1.remove(3);
	System.out.println(s1); //Q52
	
//------------------------------------------------------------------	

	boolean ans=s1.contains("blue");
	System.out.println(ans);
	
	if(s1.contains("vibgyor")) {
		System.out.println("Vibgyor is present");
	}else {
		System.out.println("vibgyor not present");   //Q53
	}
	
//------------------------------------------------------------------	
	
	Collections.sort(s1);   
	System.out.println(s1);    //Q54

//------------------------------------------------------------------	
	
	ArrayList<String> s2=new ArrayList<String>();
//	ArrayList<String> s2=s1;
	s2=s1;   								//Q55
	System.out.println(s2);
	
	
//------------------------------------------------------------------	
//	Collections.shuffle(s1);
//	System.out.println(s1);    //Q56
	
	s2.addAll(s2);
	System.out.println(s2);  
	
//------------------------------------------------------------------	

	Collections.reverse(s1);
	System.out.println(s1);
	
//------------------------------------------------------------------	
	List<String> s3=s1.subList(2, 4);
	System.out.println(s3);
	
//------------------------------------------------------------------	
	
	System.out.println(s1.equals(s3));
//------------------------------------------------------------------	
	Collections.swap(s3, 0, 1);
	System.out.println(s3);
	
	s1.addAll(s2);
	System.out.println(s1);
	
	
}
}
