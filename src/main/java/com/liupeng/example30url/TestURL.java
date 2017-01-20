package com.liupeng.example30url;

import java.net.URL;

/**
 * Created by liupeng on 2017/1/20.
 */
public class TestURL {
    public static void main(String[] args) {
        URL url = new TestURL().getClass().getResource("/hello.txt");
    }
}
