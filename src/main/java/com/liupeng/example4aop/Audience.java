package com.liupeng.example4aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by piezi on 2016/5/3.
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.liupeng.example4aop.PianoPlayer.*(..))")
    private void anyMethod() {
    }

    @Before("anyMethod()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    @Before("anyMethod()")
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    @After("anyMethod()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("anyMethod()")
    public void demandRefund() {
        System.out.println("Boo! We want money back");
    }
}
