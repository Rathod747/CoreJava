package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Testcollection {
	public static void main(String[] args) {
	
	List l = new ArrayList();
	l.add(22);
	l.add(23.2);
	l.add('a');
	l.add("java");
	System.out.println(l );
     List a = new ArrayList();
     a.add(45);
     a.add('1');
     a.addAll(l);
     System.out.println(a);
     System.out.println(l.contains(22));
    // l.containsAll()
    // System.out.println(l.containsAll());
     System.out.println(l.isEmpty());
     System.out.println(l.size());
     l.remove(3);
    System.out.println(l);
     a.removeAll(l);
     System.out.println(a);
     l.clear();
   System.out.println(l);
  
  
     
}
}