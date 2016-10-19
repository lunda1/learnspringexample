package com.liupeng.example5dynamicproxy;

/**
 * Created by piezi on 2016/5/4.
 */
public class Hello implements IHello {
    @Override
    public void hello() {
        System.out.println("hello everyone !");
    }
}
