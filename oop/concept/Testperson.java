package in.oop.concept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = "28/07/2009";
//		String  s = args[0];
		 Date d = sdf.parse(s);
		Person a = new Person();
		a.setName("Nikita");
		a.setAddress("Raibidpura");
		a.setDob(d);

		System.out.println(a.getName());
		System.out.println(a.getAddress());
		System.out.println(a.getDob());
		System.out.println(a.age);
		
	}

}
