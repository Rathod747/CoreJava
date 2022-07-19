package Testanoumous;

public class TestStatic {
public static void main(String[] args) {
	Richman1 r = new Richman1() {
		
		@Override
		public void party() {
			// TODO Auto-generated method stub
			System.out.println("party krenge");
		}
		
		@Override
		public void helptoOthers() {
			// TODO Auto-generated method stub
			System.out.println("help krna chahiye");
		}
	};r.helptoOthers();
	r.party();
	Richman1.Nikita();
	r.testdefault();	
}
}
