package com.practice;

import org.springframework.stereotype.Component;

@Component
public class MyClass {

    public void myLogic() {
        System.out.println("This is business logic");
    }

    public void Myjourney() {
        System.out.println("International tripp");
    }

    public String give() {
        return " I am varshitha";
    }
    
    public void exe() {
    	throw new RuntimeException("My own exception");
    }
}
