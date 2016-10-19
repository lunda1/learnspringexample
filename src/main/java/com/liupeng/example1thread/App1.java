package com.liupeng.example1thread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by piezi on 2016/5/2.
 */
public class App1 {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PrintThread t1 = (PrintThread) ctx.getBean("printThread");
        PrintThread t2 = (PrintThread) ctx.getBean("printThread");
        PrintThread t3 = (PrintThread) ctx.getBean("printThread");
        PrintThread t4 = (PrintThread) ctx.getBean("printThread");
        PrintThread t5 = (PrintThread) ctx.getBean("printThread");

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t5.setName("t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
