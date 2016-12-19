package com.liupeng.example18map;

import com.alibaba.fastjson.JSON;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by liupeng on 2016/10/26.
 */
public class TestMapEntry {
    public static void main(String[] args) {
        //testEntrySet();
        //testIterator();
        //testStreamMap();
        putDupliName();
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

    public static void testStreamMap(){
        List<People> crowd = new ArrayList<>();
        for(int i=0; i<10; i++){
            People p = new People();
            p.setName("p"+i);
            p.setAge(20+i);
            if(i>6){
                p.setName("px");
                p.setAge(30);
            }
            crowd.add(p);
        }
        Map<String, People> mapCrowd = crowd.stream().collect(Collectors.toMap(People::getName,o->o));
        System.out.println(JSON.toJSONString(mapCrowd));
    }

    public static void putDupliName(){
        List list = new ArrayList<>();
        list.add("testName");
        list.add("testName");
        list.add("testName");
        list.add("testName");
        System.out.println(JSON.toJSONString(list));
    }
}
class People{
    public String name;
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
