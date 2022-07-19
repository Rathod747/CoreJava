package in.com.expthand;

public class Multiplecatch {
	public static void main(String[] args) {
		String s = "Seema";
		try {
			System.out.println(s.length());
			System.out.println(s.charAt(6));
	    } catch (StringIndexOutOfBoundsException m) {
		System.out.println("String  is small");
		}
		catch (RuntimeException c) {
			System.out.println("it is not a beautiful name");
		}
		finally {
			System.out.println("I am a pandit");
		}
	}

}
