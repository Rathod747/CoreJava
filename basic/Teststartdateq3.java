package com.raysstec.basic;

import java.time.LocalDate;

public class Teststartdateq3 {
	public static void main(String[] args) {
		LocalDate endDate=  LocalDate.of( 2008 , 8 , 6);
		LocalDate today = LocalDate.now();                                                                              
		if (endDate.isAfter(today)) {
			System.out.println( "your date is today");
			
		}else if (endDate.isBefore(today)) {
			System.out.println("your date is incorrect");
		}
		
		
		
	}

	

}
