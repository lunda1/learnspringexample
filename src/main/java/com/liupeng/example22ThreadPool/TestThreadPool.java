package com.liupeng.example22ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liupeng on 2016/12/15.
 */
public class TestThreadPool {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            pool.execute(new TestThread());
        }
        pool.shutdown();
        long endTime = System.currentTimeMillis();
        System.out.println("---------"+(endTime-beginTime));
    }
}

class TestThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("thread name: "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
