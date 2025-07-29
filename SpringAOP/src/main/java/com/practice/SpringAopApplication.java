package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);
        
        MyClass mc = context.getBean(MyClass.class);

        // mc.myLogic();
        // mc.Myjourney();
//        mc.give();
        mc.exe();   
    }
}
