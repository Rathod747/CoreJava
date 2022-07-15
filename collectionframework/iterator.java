package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");
	   Iterator  it  = l.iterator();
	   while (it.hasNext()) {
		Object o = (Object) it.next();
		System.out.println(o);
		
		
		
	}
	   
		
	}

}
