package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
	public static void main(String[] args) {
		ArrayList m = new ArrayList();
		m.add(23);
		m.add(90);
		m.add('e');
		m.add("payal");
		m.add(90);
		
		Iterator w   = m.iterator();
		while (w.hasNext()) {
			Object y = (Object) w.next();
			if (y.equals(23)) {
				w.remove();
				break;
			}
			
		}System.out.println(m);
	}

}
