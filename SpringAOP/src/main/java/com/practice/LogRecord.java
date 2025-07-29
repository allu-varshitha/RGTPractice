package com.practice;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogRecord {

    private FileWriter fw;

    // Logging before myLogic() method
    @Before("execution(public void myLogic())")
    public void Recordentry() {
        try {
            fw = new FileWriter("C:\\Users\\alluk\\OneDrive\\Desktop\\Log\\Logregister.txt", true); // true for append mode
            fw.write("method started" + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Logging after myLogic() method
    @After("execution(public void com.practice.MyClass.myLogic())")
    public void Recordexit() {
        try {
            fw.write("method ended" + System.lineSeparator());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("logging ended");
    }

    // Around advice for Myjourney() method
    @Around("execution(public void Myjourney())")
    public void securitycheck(ProceedingJoinPoint pjp) {
        System.out.println("security check in india");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("immigration check");
    }

    // AfterReturning advice for give() method
    @AfterReturning(pointcut = "execution(public String give())", returning = "s")
    public void hold(String s) {
        System.out.println("value: " + s);
    }

    // AfterThrowing advice for exe() method   
    @AfterThrowing(pointcut = "execution(public void exe())", throwing = "e")
    public void getexe(Exception e) {
        System.out.println("Exception is recorded: " + e.getMessage());
    }
}
