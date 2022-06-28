package com.raysstec.basic;

public class Teststringsplit {  
	public static void main(String[] args) {
		String s = " Java is Oop ";
		System.out.println(s);
		String [] st = s.split("a");
		for(String s1:st) {
			System.out.println(s1);
		}
	 
	
}
}