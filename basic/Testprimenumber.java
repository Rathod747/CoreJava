
package com.raysstec.basic;

public class Testprimenumber {
	public static void main(String[] args) {
		int a = 0;
		int number = 35;
		for(int i =2; i<number; i++) {
			if (number%i==0) {
				a++;
			}
				
		}if (a>0) {
			System.out.println("Not prime");
		}else {
			System.out.println("prime number");
			
		}
	}
	}


