package com.liupeng.example21HashMap;

/**
 * Created by liupeng on 2016/12/14.
 */
public class HashMapTest {
    public static void main(String[] args) {
        testTableSizeFor();
    }

    public static void testTableSizeFor() {
        int n = tableSizeFor1((1<<10)-2);
        int n16 = 1<<16;
        System.out.println(Math.log(n)/Math.log(2));
    }

    private static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        final int MAXIMUM_CAPACITY = 1 << 30;
        return (n < 0) ? 1 : (n > MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    private static int tableSizeFor1(int cap) {
        int n = cap;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        final int MAXIMUM_CAPACITY = 1 << 30;
        return (n < 0) ? 1 : (n > MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
