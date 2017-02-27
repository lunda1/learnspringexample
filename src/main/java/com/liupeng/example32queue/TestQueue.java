package com.liupeng.example32queue;

/**
 * Created by liupeng on 2017/2/27.
 */
public class TestQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        try {
            for (int i = 1; i <= 4; i++) {
                queue.put(i);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            for (int i = 1; i <= 4; i++) {
                System.out.println(queue.poll());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyQueue{
    int[] arr;
    int head = 0;
    int tail = -1;
    int size = 0;
    public MyQueue(int length) {
        if (length < 0) {
            throw new RuntimeException("queue length can not smaller than zero");
        }
        arr = new int[length];
        size = length;
    }
    public boolean isFull() {
        if (head == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (head == 0) {
            return true;
        }
        return false;
    }

    public void put(int e) {
        if (!isFull()) {
            arr[head] = e;
            head += 1;
            return;
        }
        throw new RuntimeException("queue is full!");
    }

    public int poll() {
        if (!isEmpty()) {
            int temp = arr[--head];
            return temp;
        }
        throw new RuntimeException("queue is empty!");
    }
}
