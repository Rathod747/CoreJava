package Testanoumous;

public class testingAnonymous  {
	public static void main(String[] args) {
	 Richman  r = new Richman() {
		
		@Override
		public void party() {
			System.out.println("Party");
			
		}
	};r.party();
	
		
}
}  