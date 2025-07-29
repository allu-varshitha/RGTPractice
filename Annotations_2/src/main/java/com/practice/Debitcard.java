package com.practice;

import org.springframework.stereotype.Component;

@Component
public class Debitcard implements Payment {

    public Debitcard() {
        System.out.println("Debit card object is created");
    }

    public void pay() {
        System.out.println("Payment done using debit card");
    }
}
