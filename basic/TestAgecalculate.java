package com.raysstec.basic;

import java.time.LocalDate;
import java.time.Period;

public class TestAgecalculate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate Birthday = LocalDate.of(2001 , 8, 28 );
		 Period different = Period.between (Birthday, today);
		System.out.println("years" + different.getYears());
		System.out.println("Months" + different.getMonths());
		System.out.println("days" + different.getDays());
	}
	

}
