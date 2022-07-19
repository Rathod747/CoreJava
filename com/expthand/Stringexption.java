package in.com.expthand;

public class Stringexption {
	public static void main(String[] args) {
		String name = "Teena";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(5));
			
		} catch (StringIndexOutOfBoundsException b) {
			System.out.println("String abhi choti h");
		}
	catch (NullPointerException m) {
		System.out.println("sundar sa naam nhi h");
	}
		finally {
			System.out.println("this is final name");
		}
	}
	
		
}
