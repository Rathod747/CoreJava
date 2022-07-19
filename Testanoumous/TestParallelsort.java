package Testanoumous;

import java.util.Arrays;

public class TestParallelsort {
	public static void main(String[] args) {
		int[] a = {1, 22, 33, 6, 8,  9, 5};
		Arrays.parallelSort(a);
		for(int v : a) {
			System.out.println(v);
		}
	}

}
