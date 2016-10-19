package com.liupeng.example1thread;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by piezi on 2016/5/2.
 */
@Component
@Scope("prototype")
public class PrintThread extends Thread{

    @Override
    public void run(){
        System.out.println(getName()+" is running !");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+" is running again !");
    }
}
