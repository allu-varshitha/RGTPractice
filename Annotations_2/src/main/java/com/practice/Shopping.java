package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("p")// p is the reference 
public class Shopping {

   
    private Payment p;

    @Autowired
	public void setP(Payment p) {
    	System.out.println("setter");
		this.p = p;
	}
     
//	@Autowired
	public Shopping() {
		
//		System.out.println("constructor injection");
        System.out.println("Shopping object is created");
    }

    @Bean
    public void doShopping() {
    	if(p!=null) {
        p.pay();
    	}
    	else {
        System.out.println("Shopping done");
    	}
    }
}
