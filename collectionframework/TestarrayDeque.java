package com.rays.collectionframework;

import java.util.ArrayDeque;

public class TestarrayDeque {
	public static void main(String[] args) {
		ArrayDeque d= new ArrayDeque();
		d.add(11);
		d.add(13);
		d.add(14);
		d.add(15);
		d.add(98);
		
        d.addFirst("amit");
        d.addLast("rathod");
		System.out.println(d);
	}

}
