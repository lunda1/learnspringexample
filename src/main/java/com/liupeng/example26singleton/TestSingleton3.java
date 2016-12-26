package com.liupeng.example26singleton;

/**
 * 线程安全(双重检验)
 * Created by liupeng on 2016/12/23.
 */
public class TestSingleton3 {
    private static TestSingleton3 singleton3;

    private TestSingleton3() {
    }

    public static TestSingleton3 getSingleton3() {
        if (singleton3 == null) {
            synchronized (TestSingleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new TestSingleton3();
                }
            }
        }
        return singleton3;
    }
}
