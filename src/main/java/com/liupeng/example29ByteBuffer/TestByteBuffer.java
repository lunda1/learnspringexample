package com.liupeng.example29ByteBuffer;

import java.nio.ByteBuffer;

/**
 * Created by liupeng on 2017/1/16.
 */
public class TestByteBuffer {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte)'a');
        buffer.put((byte)'b');
        buffer.put((byte)'c');
        buffer.flip();
        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
        buffer.flip();
        System.out.println("----------------------");
        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
        buffer.clear();
        buffer.put((byte)'d');
//        buffer.position(4);
//        buffer.flip();
        buffer.position(2);
        buffer.limit(5);
        System.out.println("----------------------");
        while(buffer.hasRemaining()){
            System.out.print(" ("+buffer.limit()+" "+buffer.position()+")| ");
            System.out.print(buffer.get());
            System.out.println(" |("+buffer.limit()+" "+buffer.position()+")");
        }
        System.out.println("----------------------");
        buffer.position(4);
        buffer.limit(5);
        buffer.put((byte)'e');
        System.out.println(" |("+buffer.limit()+" "+buffer.position()+")");
        buffer.flip();
        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
        System.out.println("----------------------");
        System.out.println(buffer.get(0));
    }
}
