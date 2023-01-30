package com.assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Q57 {
public static void main(String[] args) {
	HashSet<Object> h1 =new HashSet<Object>();
	h1.add(1);
	h1.add(10);
	h1.add("adarsh");
	h1.add(1.02);
	h1.add("adarsh");
//	HashSet<Object> h2 =new HashSet<Object>();
	
//	h2.add(1);
//	h2.add(10);
//	h2.add("adarsh");
//	h2.add(1.02);
//	h2.add("adarsh");
//	
//	h1.addAll(h2);
//

	System.out.println(h1);
	Iterator<Object> it=h1.iterator();
	
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
//----------------------------------------------	
	System.out.println(h1.size());

	HashMap<Object,Object> h3=new HashMap<Object,Object>();
	h3.put(1, "adarsh");
	h3.put("malav", 2);
	h3.put(1, 2);
	h3.put("adarsh", "adarsh");
	h3.put("h3", "adarsh");
	
	System.out.println(h3);
	//-----------------------------------------
	System.out.println(h3.size());
	
	
	
	
	


}
}
