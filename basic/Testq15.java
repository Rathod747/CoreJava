
package com.raysstec.basic;

public class Testq15 {
	public static void main(String[] args) {
		int[] a = {78,90,45,345,789};
		int b = a[0];
		for (int i=0;i<a.length; i++) {
			if (a[i] >b) {
				b  = a[i];
				
			}
		}
		System.out.println(b);
	}

}
