package Testanoumous;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestConcurent {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> m  = new ArrayBlockingQueue<Integer>(15);
		m.add(34);
		m.add(89);
		m.add(90);
		m.add(14);
		m.add(33);
		m.add(67);
		Iterator<Integer> it = m.iterator();
		m.add(77);
		while (it.hasNext()) {
			Integer in = (Integer) it.next();
			System.out.println(in);
		}
	}

}
