package com.liupeng.example2thread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by piezi on 2016/5/2.
 */
public class App2 {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) ctx.getBean("taskExecutor");
        taskExecutor.execute(new PrintTask("t1"));
        taskExecutor.execute(new PrintTask("t2"));
        taskExecutor.execute(new PrintTask("t3"));
        taskExecutor.execute(new PrintTask("t4"));
        taskExecutor.execute(new PrintTask("t5"));
        for(;;){
            int count = taskExecutor.getActiveCount();
            System.out.println("Active thread :" + count);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 0){
                taskExecutor.shutdown();
                break;
            }
        }
    }
}
