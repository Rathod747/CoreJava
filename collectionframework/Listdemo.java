package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Listdemo {
public static void main(String[] args) {
	List li  = new ArrayList();
     li.add(22); 
     li.add(22.2);
     li.add('u');
     li.add("Java");
     li.add(22);
     System.out.println(li);
     System.out.println(li.get(3));
     System.out.println(li.remove(4));
     System.out.println(li.set( 3 , 78));
     System.out.println(li.indexOf(22.2));
     System.out.println(li.lastIndexOf(22));
     System.out.println(li.subList(1 , 4));
}
}
