package com.liupeng.example18map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by liupeng on 2016/10/26.
 */
public class TestMapEntry {
    public static void main(String[] args) {
        //testEntrySet();
        testIterator();
    }

    public static void testEntrySet(){
        System.out.println("testEntrySet():");
        Map<String,String> map = new HashMap<>();
        map.put("1","aaa");
        map.put("2","bbb");
        map.put("3","ccc");
        map.put("4","ddd");
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void testIterator(){
        System.out.println("testIterator():");
        Map<String,String> map = new HashMap<>();
        map.put("1","aaa");
        map.put("2","bbb");
        map.put("3","ccc");
        map.put("4","ddd");
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
