package com.ioc;

public class cash implements Payment {
	public cash() {// constructor method
		// TODO Auto-generated method stub
		System.out.println("payment through cash");
		
	}

	@Override
	public void pay(int amt) {
		// TODO Auto-generated method stub
		
		System.out.println("bill implemented through cash");
		
	}
	

}
