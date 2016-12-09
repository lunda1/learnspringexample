package com.liupeng.example20set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liupeng on 2016/11/29.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 7; i < 15; i++) {
            set2.add(i);
        }
        set.addAll(set2);
        System.out.println(set);
    }
}
