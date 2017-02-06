package com.liupeng.example26singleton;

/**
 * 静态内部类
 * Created by liupeng on 2016/12/23.
 */
public class TestSingleton4 {
    private static class SingletonHolder{
        private static final TestSingleton4 INSTANCE = new TestSingleton4();
    }
    private TestSingleton4(){}
    public static TestSingleton4 getSingleton4(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        Object o;
        System.out.println((o = TestSingleton4.getSingleton4()) == null ? null : o.toString());
    }
}
