package com.rays.collectionframework;

import java.util.Comparator;

public class Marksheet1 implements Comparable<Marksheet1> {
private String rollno;
private String fname;
private String lname;
private int hindi;
private int english;
private int maths;
public Marksheet1() {
	
}
public Marksheet1(String r , String f , String l , int h , int e , int m) {
	rollno = r;
	fname = f;
	lname = l;
	hindi = h;
	english = e;
	maths = m;
	
}
public String getRollno() {
	return rollno;
}
public String getFname() {
	return fname;
}
public String getLname() {
	return lname;
}
public int getHindi() {
	return hindi;
}
public int getEnglish() {
	return english;
}
public int getMaths() {
	return maths;
}
@Override
public int compareTo(Marksheet1 o) {
	// TODO Auto-generated method stub
	return this.fname.compareTo(o.fname);
	
}


}


		
	


