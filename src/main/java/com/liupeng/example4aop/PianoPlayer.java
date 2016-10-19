package com.liupeng.example4aop;

import org.springframework.stereotype.Service;

/**
 * Created by piezi on 2016/5/3.
 */
@Service("pianoPlayer")
public class PianoPlayer {
    public void doPlay() throws Exception{
        System.out.println("----doPlay");
//        throw new Exception("TEST TO THROW A EXCEPTION!");
    }
}
