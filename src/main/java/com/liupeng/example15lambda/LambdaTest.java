package com.liupeng.example15lambda;

import com.google.common.base.Joiner;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by liupeng on 2016/9/27.
 */
public class LambdaTest {
    public static void main(String[] args) {
        //testRunnableLambda();
        //testStream();
        //testStreamMap();
        testOneElementJoin();
    }

    public static void testRunnableLambda(){
        Runnable newRunnable = () -> {
            System.out.println(Thread.currentThread().getName() + ": My New Lambda Runnable");
        };
        new Thread(newRunnable).start();
        new Thread(()->{System.out.println(Thread.currentThread().getName() + ": test22222");}).start();
    }

    public static void testStream(){
        String[] arr = {"a0","a1","a2","a3","a4","a5","a6","a7","a8"};
        List<String> list = Arrays.asList(arr);
        list.forEach((str)-> System.out.print(" "+str));
        System.out.println("\r\n---------------------------");
        list.forEach(System.out::println);
        list.forEach(System.out::print);
    }

    public static void testStreamMap(){
        List<IdAndName> idAndNameList = new ArrayList<>();
        for(int i=0;i<20;i++){
            IdAndName idAndName = new IdAndName();
            if(i>18){
                idAndName.setId(String.valueOf(i-1));
            }else{
                idAndName.setId(String.valueOf(i));
            }
            idAndName.setName("name"+i);
            idAndNameList.add(idAndName);
        }
        List<String> idList = idAndNameList.stream().map(o->o.getId()).collect(Collectors.toList());
        System.out.println("idList:");
        for(String s : idList){
            System.out.println(s);
        }
        List<String> distinctIdList = idAndNameList.stream().map(o->o.getId()).distinct().collect(Collectors.toList());
        System.out.println("distinct idList:");
        for(String s : distinctIdList){
            System.out.println(s);
        }
    }

    public static void testOneElementJoin(){
        List<String> list = new ArrayList<>();
        list.add("3000");
        list.add("456");
        String str = Joiner.on(",").join(list);
        System.out.println(str);
    }

}

class IdAndName{
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


