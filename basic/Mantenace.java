package com.raysstec.basic;

import java.util.Calendar;

public class Mantenace { 
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	for (int a = 0; a<=12; a++) {
		cal.add(Calendar.DATE, 30);
		System.out.println(cal.getTime());
	}
}
}                                                                     
