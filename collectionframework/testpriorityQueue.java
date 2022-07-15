package com.rays.collectionframework;

import java.util.PriorityQueue;

public class testpriorityQueue {
	public static void main(String[] args) {
		PriorityQueue w =  new PriorityQueue();
		//w.add(1);
		//w.add(91);
		//w.add(67);
		//w.add(90);
		//w.add(7);
		
		
		w.add("Ram");
		w.add("Shyam");
		w.add("Goru");
		w.add("Bharti");
		
		System.out.println(w.remove());
		System.out.println(w.remove());
		System.out.println(w.remove());
		//System.out.println(w.poll());
		System.out.println(w);
	}

}
