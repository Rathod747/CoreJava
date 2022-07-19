package in.oop.concept;

public class Testaccount {
	public static void main(String[] args) {
		Account a = new Account();
		
				a.setNumber("789679043201234");
				System.out.println(a.getNumber());
		a.setAccountType("sbi");
		System.out.println(a.getAccountType());
		a.setBalance(50000);                                                                                                                                                                                                                                                                                                                                                                                                                  
		System.out.println(a.getBalance());
		a.deposite(600);
		System.out.println("After deposite =" + a.getBalance());
		System.out.println();
		a.withdrawl(1000);
		System.out.println("After withdrawl =" + a.getBalance());
	    a.paybill(500);
	    System.out.println("After paybill =" + a.getBalance());
	    a.fundtransfer(900);
	    System.out.println("After fundtransfer =" + a.getBalance());
	    System.out.println("present balance = " + a.getBalance());
	
	
		
	}

}