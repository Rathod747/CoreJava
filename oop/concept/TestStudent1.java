package in.oop.concept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStudent1 extends Person1 {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String s = "4/12/2000";
	Date d1 = sdf.parse(s);
	 Student1 a = new Student1("55" , 98 , "Uttam"  , "Indore" , d1);
	 System.out.println(a.getName());
	 System.out.println(a.getAddress());
	 System.out.println(a.getMarks());
	 System.out.println(a.getRollno());
	 System.out.println(a.getDob());
}
}
