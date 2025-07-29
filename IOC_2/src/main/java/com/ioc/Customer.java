package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//		System.out.print(context);
		Shopping shop=context.getBean(Shopping.class);
		shop.doPayment(500);
         
	}		

}
