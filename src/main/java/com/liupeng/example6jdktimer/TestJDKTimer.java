package com.liupeng.example6jdktimer;

import java.util.Timer;

/**
 * Created by piezi on 2016/5/11.
 */
public class TestJDKTimer {
    public static void main(String[] args){
        Timer myFirstTimer = new Timer();
        MyFirstTimerTask myFirstTimerTask = new MyFirstTimerTask();
        myFirstTimer.schedule(myFirstTimerTask,500L,3000L);
    }
}
