package com.raysstec.basic;

public class Test2darrayq8  {
	public static void main(String[] args) {
		int [][] b = new int [10][10];
		for (int i = 1; i<10; i++) {
			for (int j=1; j<10; j++) {
			b[i][j]=i*j;
			System.out.print(b[i][j]+ "\t");
		}
		System.out.println( " ");
			
		}
	
	}
}


