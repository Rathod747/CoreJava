package com.raysstec.basic;

public class Testq14 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				x = x + i;
			} else {
				y = y + i;
				System.out.println(x / 2);
				System.out.println(y / 2);
			}

		}
	}
}
