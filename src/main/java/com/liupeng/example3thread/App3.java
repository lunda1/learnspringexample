package com.liupeng.example3thread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by piezi on 2016/5/2.
 */
public class App3 {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) ctx.getBean("taskExecutor");
        PrintTask2 t1 = (PrintTask2) ctx.getBean("printTask2");
        PrintTask2 t2 = (PrintTask2) ctx.getBean("printTask2");
        PrintTask2 t3 = (PrintTask2) ctx.getBean("printTask2");

        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        taskExecutor.execute(t1);
        taskExecutor.execute(t2);
        taskExecutor.execute(t3);

        for(;;){
            int count = taskExecutor.getActiveCount();
            System.out.println("Active threads : "+ count);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==0){
                taskExecutor.shutdown();
                break;
            }
        }
    }
}
