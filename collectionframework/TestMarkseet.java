package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarkseet {
	public static void main(String[] args) {
		Marksheet m1 = new Marksheet();
		m1.setRollno("1");
		m1.setFname(" Anshul ");
		m1.setLname("Prajapati");
		m1.setPhy(80);
		m1.setChe(78);
		m1.setMath(90);

		Marksheet m2 = new Marksheet();
		m2.setRollno("2");
		m2.setFname("Arun ");
		m2.setLname("Mandloi");
		m2.setPhy(88);
		m2.setChe(76);
		m1.setMath(40);

		Marksheet m3 = new Marksheet();
		m3.setRollno("3");
		m3.setFname(" Aryant");
		m3.setLname("Sharma");
		m3.setPhy(60);
		m3.setChe(79);
		m3.setMath(80);

		Marksheet m4 = new Marksheet();
		m4.setRollno("4");
		m4.setFname("Vishvas ");
		m4.setLname("Sharma");
		m4.setPhy(89);
		m4.setChe(68);
		m4.setMath(55);

		Marksheet m5 = new Marksheet();
		m5.setRollno("5");
		m5.setFname("Teena ");
		m5.setLname("prajapat");
		m5.setPhy(80);
		m5.setChe(78);
		m5.setMath(90);

		Marksheet m6 = new Marksheet();
		m6.setRollno("6");
		m6.setFname("Nikita");
		m6.setLname("Rathod");
		m6.setPhy(88);
		m6.setChe(70);
		m6.setMath(90);

		ArrayList m = new ArrayList();
		Getfname g = new Getfname();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m.add(m5);
		m.add(m6);
		Collections.sort( m , g);
       
		Iterator it = m.iterator();
		while (it.hasNext()) {
			Marksheet P = (Marksheet) it.next();
			System.out.println(P.getRollno() + " " + P.getFname() + " " + P.getLname() + " " + P.getChe() + " "
					+ P.getPhy() + " " + P.getMath());

		}

	}

}
