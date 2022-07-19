package in.oop.concept;

import java.util.Date;

public class Student1 {
	private String rollno;
	private int marks;
	private String name;
	private String address;
	private Date dob;
	public Student1() {
		
	}
	public Student1(String rollno, int marks, String name, String address, Date dob) {
	
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	public String getRollno() {
		return rollno;
	}
	public int getMarks() {
		return marks;
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
