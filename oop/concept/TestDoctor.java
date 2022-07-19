package in.oop.concept;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDoctor extends Person1 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = "21/08/2004";
		Date d1 = sdf.parse(s);
		Doctor v = new Doctor("45" , " Rupesh" , "Raibidpura" , d1);
		System.out.println(v.getRegistrationNo());
		System.out.println(v.getName());
		System.out.println(v.getAddress());
		System.out.println(v.getDob());
	}

}
