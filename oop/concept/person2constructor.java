package in.oop.concept;

import java.util.Date;

public class person2constructor {
	private String name;
	private String address;
	private Date dob;

	public person2constructor() {

	}

	public person2constructor(String c, String d, Date e) {
		name = c;
		address = d;
		dob = e;

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
