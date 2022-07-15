package com.rays.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class TestHashset {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(12);
		s.add("kuldeep");
		s.add(89.9);               /// koi order me arrange nh krta h
		s.add("ram");
		s.add(91);
		s.add('b');
		System.out.println(s);
	}

}
