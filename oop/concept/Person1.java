package in.oop.concept;

import java.util.Date;

public class Person1 {
	private String name;
	private String address;
	private Date  dob;
	 public  Person1() {
		 
	 }
	 public Person1(String a, String b , Date d) {
		 name = a;
		 address = b;
		 dob = d;
		 
		 
	 }
	public String getName() {
		return name;
	}
 
	public String getAddress() {
		return address;
	}
	
	public Date getDob() {
		return dob;
	}
	
	

}
