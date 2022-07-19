package in.oop.concept;

import java.util.Date;

public class Bussinessman extends Person1 {
	private double income;
	private String name;
	private String address;
	private Date dob;
	

	public Bussinessman() {
		
	}
	public Bussinessman(double a , String  b , String c ,Date d ) {
		income = a;
		name = b;
		address = c;
		dob = d;
		
	}
	public double getIncome() {
		return income;
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
