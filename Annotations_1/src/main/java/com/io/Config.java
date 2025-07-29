package com.io;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.Bus;


@Configuration
@ComponentScan(basePackages={"com.io","in.com"})
public class Config {
	public Config() {
		System.out.println("Config object is created");
	}

	@Bean
	void createBus() {
		Bus b=new Bus();
		System.out.println(b);
	}

}
