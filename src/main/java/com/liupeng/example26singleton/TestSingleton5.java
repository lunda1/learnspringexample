package com.liupeng.example26singleton;

/**
 * Created by liupeng on 2016/12/23.
 */
public class TestSingleton5 {
    private TestSingleton5(){};
    private static TestSingleton5 singleton5 = new TestSingleton5();
    public static TestSingleton5 getSingleton5(){
        return singleton5;
    }

}
