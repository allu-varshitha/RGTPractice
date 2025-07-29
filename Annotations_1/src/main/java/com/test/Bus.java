package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bus {
	public Bus() {
		System.out.println("bus object is created");
	}
	
	@Override
	public String toString() {
		
		return "I am bus ";
	}

}
