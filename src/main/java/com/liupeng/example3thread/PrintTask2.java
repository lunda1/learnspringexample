package com.liupeng.example3thread;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by piezi on 2016/5/2.
 */
@Component
@Scope("prototype")
public class PrintTask2 implements Runnable {
    String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+" is running !");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+" is running again !");
    }
}
