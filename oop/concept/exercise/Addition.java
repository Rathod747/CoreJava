package in.oop.concept.exercise;

public class Addition {
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	public  void add ( int c , float d) {
		System.out.println(c+d);
	}
	public void add(int m , double n) {
		System.out.println(m+n);
	}
	public static void main(String[] args) {
		Addition a = new Addition ();
		System.out.println(2+3);
		System.out.println(8+6.6);
		System.out.println(9+3.14);
	}

}
