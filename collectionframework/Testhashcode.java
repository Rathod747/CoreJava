package com.rays.collectionframework;

import java.util.HashMap;

public class Testhashcode {
	public static void main(String[] args) {
		String s = "Nikita";
		String v = "Nikita";
		System.out.println(s.hashCode());
		System.out.println(v.hashCode());
		HashMap  m  = new HashMap();
		HashMap m1 = new HashMap();
		
		m.put( 1 , "Rani");
		m.put(2, "Ruhi");
		System.out.println(m.hashCode() + " " + m1.hashCode());
	}

}
