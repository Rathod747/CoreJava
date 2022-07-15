package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;



public class Testgenerics {
	public static void main(String[] args) {
	ArrayList<String> m = new ArrayList<String>();
	m.add("Moni");
	m.add("Manju");
	m.add("Salu");
	m.add("Sapna");
	System.out.println(m);
     Iterator<String> it = m.iterator();
     
     while (it.hasNext()) {
		String n = (String) it.next();
		
	}
	
	
	}

}
