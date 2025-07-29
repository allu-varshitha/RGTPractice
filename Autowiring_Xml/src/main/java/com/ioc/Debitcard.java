package com.ioc;

public class Debitcard implements Payment {

	
	public Debitcard() {   //constrctor 
		// TODO Auto-generated method stub
		System.out.println("payment through debit card");
		
	}

	@Override
	public void pay(int amt) {
		// TODO Auto-generated method stub
		System.out.println("bill paid through db");
		
	}

}
