package in.oop.concept;

import java.util.Date;

public class Employe {
	private String name;
	private String address;
	private Date dob;
	private int height;
	public static final int age = 56;
	public Employe() {
		
	}
	public Employe (String a , String b) {
		name = a;
		address = b;
		
	}
	public Employe (Date c, int d  ) {
		dob = c;

		height = d;
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
	public int getHeight() {
		return height;
	}

	public static int getAge() {
		return age;
	}
	
	

}
