package com.rays.intfc;

public class Bussinessman implements Richman , Socialworker {

	@Override
	public void helpToothers() {
	System.out.println("gfghf");
		
	}

	@Override
	public int earnMoney() {
		return 4544;
	
	
		
	}

	@Override
	public int donation() {
        return 3434;

		
	}

	@Override
	public int party() {
	return 500;
	
		
	}
	public static void main(String[] args) {
		Bussinessman b = new Bussinessman();
		b.helpToothers();
		System.out.println(b.donation());
		System.out.println(b.earnMoney());
		System.out.println(b.party());
	
		
		
		
		
	}

}
