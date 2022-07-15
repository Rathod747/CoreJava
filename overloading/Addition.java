package com.raystec.overloading;

public class Addition {
	public void Add(int a , int b) {
		System.out.println(a+b);
	}
	public void Add(int a , int b , int c) {
		System.out.println(a+b+c);
	}
	public void Add(double a , int b) {
		System.out.println(a+b);
	}
	public void Add(int v , double n) {
		System.out.println(v+n);
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.Add(2, 5);
		a.Add(3.3 , 6);
		a.Add(4 , 5, 6 );
	     a.Add(8 , 8.9);
	}

}
