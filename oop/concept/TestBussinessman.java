package in.oop.concept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBussinessman { 
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s ="28/07/2004";
		Date d1 = sdf.parse(s);
		
	
	Bussinessman b = new Bussinessman(  5000 , "Kuldeep" , "indore" , d1);
	System.out.println(b.getName());
	System.out.println(b.getAddress());
	System.out.println(b.getIncome());
	System.out.println(b.getDob());
	 

}
}