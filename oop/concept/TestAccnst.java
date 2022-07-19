package in.oop.concept;

public class TestAccnst {
	public static void main(String[] args) {
		Accnst a = new Accnst( "0987612345509" , "saving" , 30000);
		System.out.println(a.getNumber());
		System.out.println(a.getAccounttype());
		System.out.println(a.getBalance());
		a.deposite (5000);
		System.out.println("After deposite" +a.getBalance());
		a.witdrawl(4000);
		System.out.println("After withdrawl" + a.getBalance());
		a.fundtransfer(2000);
		System.out.println("After fundtransfer" + a.getBalance());
		a.paybill(500);
		System.out.println("After paybill" + a.getBalance());
	}

}
