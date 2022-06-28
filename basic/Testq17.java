package com.raysstec.basic;

public class Testq17 {
	public static void main(String[] args) {
		int[] a = { 2,3,4,6,8,9 };
		int[] b= {2,3,4,6,8 };
		int x = 0;
		int y =0;
		int miss = 0;
		
		for(int i:a) {
			x= x+i;
		}
		for(int j:b) {
				y = y+j;
		}
			 miss =  x-y ;
			 System.out.println(miss);
			
			
		}
	}


  