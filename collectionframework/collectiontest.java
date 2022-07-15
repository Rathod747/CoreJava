package com.rays.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class collectiontest {
	public static void main(String[] args) {
		List s = new LinkedList();
		s.add(1);
		s.add(7.99);
		s.add("Vandu");
		s.add('m');
		System.out.println(s);
		List m = new LinkedList();
		m.add(4);
		m.add(9);
		m.add("singer");
		m.addAll(s);
		System.out.println(m);
		m.clear();
	  System.out.println(m);
	 System.out.println(s.contains(1));
     System.out.println(s.isEmpty() );
     System.out.println(s.remove(3));
     m.removeAll(s);
     System.out.println(m);
     System.out.println(s.size());
	
	
	}

}
