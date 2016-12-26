package com.liupeng.example26singleton;

/**
 * 普通懒汉模式
 * Created by liupeng on 2016/12/23.
 */
public class TestSingleton1 {
    private static TestSingleton1 singleton1 = null;
    private TestSingleton1(){}
    public static TestSingleton1 getSingleton1(){
        if(singleton1 == null){
            singleton1 = new TestSingleton1();
        }
        return singleton1;
    }
}
