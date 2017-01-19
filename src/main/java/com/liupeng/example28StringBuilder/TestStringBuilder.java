package com.liupeng.example28StringBuilder;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liupeng on 2017/1/9.
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        /*
        StringBuilder ori = new StringBuilder();
        ori.append("12345");
        String s = ori.substring(0,ori.toString().length()-1);
        System.out.println("---------------"+s);*/

        //testArray();
        testStringContains();
    }

    public static void testArray(){
        List<String> employeeIds = new ArrayList<>();
        employeeIds.add("1");
        employeeIds.add("2");
        employeeIds.add("3");
        employeeIds.add("4");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        String str1 = Joiner.on(",").join(employeeIds);
        String str2 = Joiner.on(",").join(integerList);

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.equals(str2));
    }

    public static void testStringContains(){
        String s = "2,3,11";
        System.out.println(s.contains("1"));
    }
}
