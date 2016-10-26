package com.liupeng.example17null;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by liupeng on 2016/10/23.
 */
public class TestNull {
    public static void main(String[] args) {
//        testNullListInFor();
        testSkip();
    }

    public static void testNullListInFor(){
        List<String> nullList = null;
        List<String> newNullList = new ArrayList<>();
        for (String s : nullList){
//            System.out.println(s);
            newNullList.add(""+s+"");
        }
    }

    public static void testSkip(){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<31;i++){
            list.add(i);
        }
        List<Integer> newList = list.stream().skip(30).limit(40).collect(Collectors.toList());
        System.out.println(newList.size());
        //3,128,1326,1327,1329,1330,1331,1353,1354,1355,1428,1462,3556,3566
    }
}
