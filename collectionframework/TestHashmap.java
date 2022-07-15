package com.rays.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class TestHashmap {
	public static void main(String[] args) {
		Map m = new HashMap();
       m.put( 1 , "ranu");
       m.put( 2 , "shri");
       m.put( 3 , "Deepak");
       m.put(4 , "Swastik");
       System.out.println(m);
       System.out.println(m.get(4));
       System.out.println(m.keySet());
       System.out.println(m.values());
       System.out.println(m.entrySet());
       System.out.println(m.containsKey(1));
       System.out.println(m.containsValue(2));
       System.out.println(m.isEmpty());
       System.out.println(m.remove(2));
       System.out.println(m.size());
	}

}
