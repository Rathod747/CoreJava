package in.com.expthand;

public class Throwslogin {
	public static void main(String[] args) throws LoginException {
		auth("vijay");
		
	}

	private static void auth(String login) throws LoginException {
		LoginException l = new LoginException();
		throw l;
		
	}
	

}
