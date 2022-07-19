package in.com.expthand;

public class Testcatch {
	public static void main(String[] args) {
		String name = "Vishal";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(8));
			
		} catch (Exception e ) {
		System.out.println("Error" + e.getMessage());		}
	}
	
	

}
