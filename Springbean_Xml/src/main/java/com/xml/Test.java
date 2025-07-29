package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
	    Mybean bean=context.getBean(Mybean.class);
		bean.doSomething();
	}

}
