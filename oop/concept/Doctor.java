package in.oop.concept;

import java.util.Date;

public class Doctor {
	private String  registrationNo;
	private String name;
	private String address;
	private Date dob;
	public Doctor() {
		
	}
	public Doctor(String registrationNo, String name, String address, Date dob) {
		
		this.registrationNo = registrationNo;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	public String getRegistrationNo() {
		return registrationNo;
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


