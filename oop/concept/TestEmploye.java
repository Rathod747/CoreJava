package in.oop.concept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmploye {
	public static void main(String[] args) throws ParseException {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 String s = "19/06/1999";
		 Date c= sdf.parse(s);
		 Employe i= new Employe("Monika" , "khargone");
		 Employe j= new Employe(c,5);
		 
		 
		 System.out.println(i.getName());
		 System.out.println(i.getAddress());
		 System.out.println(j.getDob());
		 System.out.println(j.getHeight());
		System.out.println(Employe.age);
	}
	

}
