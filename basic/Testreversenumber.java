package com.raysstec.basic;

public class Testreversenumber { 
	public static void main(String[] args) {
		int number = 45678, reverse = 0;
		while (number >0){
			reverse = number%10;
			System.out.print(reverse);
			number = number/10;
			
		}
		
		
		
	}

}
