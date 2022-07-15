package com.rays.collectionframework;

import java.util.Comparator;

public class Getfname implements Comparator<Marksheet> {
	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return o1.getPhy()-(o2.getPhy());
	}

	

	
		
	}


