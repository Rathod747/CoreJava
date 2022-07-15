package com.rays.collectionframework;

import java.util.Comparator;

public class OrderbyName implements Comparator<Marksheet1> {
	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Marksheet1 o1, Marksheet1 o2) {
		// TODO Auto-generate.d method stub
		return o1.getLname().compareTo(o2.getLname());
		
	}

}
