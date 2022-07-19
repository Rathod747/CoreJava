package Testanoumous;

public class Testlambda1 {
	public static void main(String[] args) {
		Calculation1 a = (int c , int d) -> {
			System.out.println("Addition :" +(c+d));
		};
	   a.add(7, 7);
	   
	    Calculation1 m  = (int p , int q)->{
			System.out.println("Muliply:" + (p*q));
		};
		m.add(8, 9);
		
		Calculation1 n  = (int r , int s)->{
		System.out.println("div:" + (r/s));
		};
		n.add(81 , 9);
		
		Calculation1 r  = (int t , int u)->{
			System.out.println("Subtract :" + (t-u));
		};
		n.add(89 , 9);		
		

	}
}
