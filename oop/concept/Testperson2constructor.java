package in.oop.concept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson2constructor {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = "28/08/2001";
		Date d1 = sdf.parse(s);
		person2constructor a = new person2constructor("nikita ", "khargone", d1);
		System.out.println(a.getName() + a.getAddress() + a.getDob());
	}

}
