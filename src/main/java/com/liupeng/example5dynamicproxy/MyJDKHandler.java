package com.liupeng.example5dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by piezi on 2016/5/4.
 */
public class MyJDKHandler implements InvocationHandler{

    private Object target;

    public MyJDKHandler(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------------------before jdk2 hello()--------------------");
        Object obj = method.invoke(target,args);
        System.out.println("--------------------after jdk2  hello()--------------------");
        return obj;
    }
}
