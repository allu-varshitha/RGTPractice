package com.ioc;

public class Shopping {
           
 private Payment p;
	
	public Shopping() {
		System.out.println("Payment for Shopping");
	}
	
//	void setPayment(Payment p) { // setter injection 
//		this.p=p;
//	}
//	
	// we have to remove userdefined setter method 
	
	public void setP(Payment p) {
		System.out.println("setter injection method");
		this.p = p;
	}
//	public Shopping(Payment p) {
//		this.p=p;
//	}
	
	// we have to remove userdefined constructor method 
	public Shopping(Payment p) {
		System.out.println("constructore injection method");
		
		this.p = p;
	}

		void doPayment(int amt) {
		if(p!=null) {
			p.pay(amt);
		}else {
			System.out.println("No payment is done");
		}
	}



	
}
