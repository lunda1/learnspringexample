package com.liupeng.example6jdktimer;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by piezi on 2016/5/11.
 */
public class MyFirstTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("myfirsttimertask"+new Date());
    }
}
