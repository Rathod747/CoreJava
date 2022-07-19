package in.oop.concept;

public class Accnst {
	private String number;
	private String accounttype;
private  double balance;

	public Accnst() {
		
	}
public  Accnst(String n ,String t , double b ) {
 number = n;
 accounttype = t;
 balance= b;
}
public String getNumber() {
	return number;
}

public String getAccounttype() {
	return accounttype;
}

public double getBalance() {
	return balance;
}
public void deposite(double b) {
	balance = balance + b;
	
}
public void witdrawl(double w) {
	balance = balance-w;
	
}
public void fundtransfer(double f) {
	balance = balance -f;
}
 public void paybill (double p) {
	 balance = balance - p; 
 }


}