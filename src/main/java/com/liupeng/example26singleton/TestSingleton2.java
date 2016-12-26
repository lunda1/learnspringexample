package com.liupeng.example26singleton;

/**
 * 线程安全单例模式(synchronized方法)
 * Created by liupeng on 2016/12/23.
 */
public class TestSingleton2 {
    private static TestSingleton2 singleton2 = null;
    private TestSingleton2(){}
    public static synchronized TestSingleton2 getSingleton2(){
        if(singleton2==null){
            singleton2 = new TestSingleton2();
        }
        return singleton2;
    }
}
