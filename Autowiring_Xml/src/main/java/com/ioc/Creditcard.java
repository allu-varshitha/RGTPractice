package com.ioc;

public class Creditcard implements Payment {


	public  Creditcard() {
		// TODO Auto-generated method stub
		System.out.println("payement through credit card");
	}

	@Override
	public void pay(int amt) {
		// TODO Auto-generated method stub
		System.out.println("bill paid through cc");
		
	}

}
