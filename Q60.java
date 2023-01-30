package com.assignments;

import java.util.HashSet;
import java.util.Set;


public class Q60 {
public static void main(String[] args) {
Set<Object> h1=new HashSet<>();
	
	
	h1.add(12);
	h1.add(102);
	h1.add("adarsh");
	h1.add(1.022);
	h1.add("adarsh2");
	h1.add(Integer.valueOf(1002));
	
	
Set<Object> h2=new HashSet<>();
	
	
	h2.add(1);
	h2.add(10);
	h2.add("adarsh");
	h2.add(1.02);
	h2.add("adarsh");
	h2.add(Integer.valueOf(100));
	
	h1.retainAll(h2);
	System.out.println(h1);
}
}
