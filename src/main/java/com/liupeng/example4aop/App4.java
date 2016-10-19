package com.liupeng.example4aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by piezi on 2016/5/3.
 */
public class App4 {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PianoPlayer pianoPlayer = (PianoPlayer) ctx.getBean("pianoPlayer");
        pianoPlayer.doPlay();
    }
}
