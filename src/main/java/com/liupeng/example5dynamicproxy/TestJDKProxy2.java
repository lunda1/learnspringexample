package com.liupeng.example5dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by piezi on 2016/5/4.
 */
public class TestJDKProxy2 {
    public static void main(String[] args){
        //1.创建被代理对象
        IHello obj = new Hello();
        //2.创建InvocationHandler
        InvocationHandler handler = new MyJDKHandler(obj);
        //3.创建代理对象
        IHello proxy = (IHello) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),new Class[]{IHello.class},handler);
        //4.调用代理对象
        proxy.hello();
    }
}
