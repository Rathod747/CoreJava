package com.raysstec.basic;

public class Testcharcount {
	public static void main(String[] args) {
		String n =  "5656565";
		char search = '6';
		int a = 0;
		for (int i = 0; i<n.length()-1; i++ ) {
			if (n.charAt(i)== search)
				a++;
		}
		System.out.println("The character" + search + "appears" + a + "times");
			
		}
		
	}


