package com.raysstec.basic;

public class TestSwitch {
	public static void main(String[] args) {
		int day = 1;
		String dayString= null;
		switch(day) {
				case 0:
					dayString = "Sunday";
		break;
		case 1:
		dayString = "Monday";
		 break;
		case 2:
		dayString = "tuesday";
		break;
		case 3 :
		dayString = "Wednesday";
		default:
		dayString   = "This day is yet to come ";
		}
		System.out.println(dayString); 
	}
	
	

}
