package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet1 {
	public static void main(String[] args) {
		Marksheet1 m1 = new  Marksheet1("1" , "Ajay" , "Jain" , 67 , 81  , 44);
		Marksheet1 m2 = new  Marksheet1("2" , "Ajay" , "Patel" , 89 , 82  , 45);
		Marksheet1 m3 = new  Marksheet1("3" , "Ajay" , "Gurjar" , 33 , 83  , 46);
		Marksheet1 m4 = new  Marksheet1("4" , "Ajay" , "Verma" , 54 , 84  , 47);
		Marksheet1 m5 = new  Marksheet1("5" , "Ajay" , "Sharma" , 73 , 85  , 48);
		  
		ArrayList e = new ArrayList();
		OrderbyName  b  = new OrderbyName();
		e.add(m1);
		e.add(m2);
		e.add(m3);
		e.add(m4);
		e.add(m5);
		Collections.sort(e , b);
		Iterator r = e.iterator();
		while (r.hasNext()) {
			Marksheet1 p = (Marksheet1) r.next();
		System.out.println(p.getRollno() + " " + p.getFname() + " " + p.getLname() + " " + p.getHindi() + " "+ p.getEnglish()+ " " + p.getMaths());
	}

}
}