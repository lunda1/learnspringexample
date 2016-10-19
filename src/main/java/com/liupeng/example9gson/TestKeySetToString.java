package com.liupeng.example9gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by piezi on 2016/3/20.
 */
public class TestKeySetToString{

    public static void main(String[] args){
        Map<String,String> newMap = new HashMap<String,String>();
        newMap.put("first","111");
        newMap.put("second", "222");
        newMap.put("third", "333");
        newMap.put("forth", "444");

        String newMapKeySetToString =newMap.keySet().toString();
        System.out.println(newMapKeySetToString.length());
        System.out.println(newMapKeySetToString);
        System.out.println(newMapKeySetToString.substring(1,newMapKeySetToString.length()-1));
    }
}
