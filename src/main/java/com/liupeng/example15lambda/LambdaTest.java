package com.liupeng.example15lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liupeng on 2016/9/27.
 */
public class LambdaTest {
    public static void main(String[] args) {
        //testRunnableLambda();
        testStream();
    }

    public static void testRunnableLambda(){
        Runnable newRunnable = () -> {
            System.out.println(Thread.currentThread().getName() + ": My New Lambda Runnable");
        };
        new Thread(newRunnable).start();
        new Thread(()->{System.out.println(Thread.currentThread().getName() + ": test22222");}).start();
    }

    public static void testStream(){
        String[] arr = {"a0","a1","a2","a3","a4","a5","a6","a7","a8"};
        List<String> list = Arrays.asList(arr);
        list.forEach((str)-> System.out.print(" "+str));
        System.out.println("\r\n---------------------------");
        list.forEach(System.out::println);
        list.forEach(System.out::print);
    }
}
