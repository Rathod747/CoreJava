package in.com.expthand;

public class Testexception {
	public static void main(String[] args) {
		int i = 15;
		int k = 0;
		try {
			double div = i/k;
		   System.out.println(div);
			
		} catch ( ArithmeticException e) {
			System.out.println("Zero se divide nhi ke skte");
	       System.out.println(e.getMessage());
		   e.printStackTrace();
		}
		finally {
			System.out.println("I am finally");
		}
	}

}
