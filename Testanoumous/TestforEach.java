package Testanoumous;

import java.util.ArrayList;

public class TestforEach {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
	a.forEach((li)-> 
	{
		System.out.println(li);});
	}

}
