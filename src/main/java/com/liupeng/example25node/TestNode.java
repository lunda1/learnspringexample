package com.liupeng.example25node;

/**
 * description 单链表顾名思义就是只有一条链，即每个对象只有一个next对象链接到下个对象
 * Created by liupeng on 2016/12/22.
 */
public class TestNode {
    public static void main(String[] args) {
        Node head = generateHead();
        //headInsert(head);
        rightNow(head);
    }

    public static Node generateHead() {
        Node head = new Node();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        //构建原始列表
        head.setNext(n1);
        n1.setId(1);
        n1.setNext(n2);
        n2.setId(2);
        n2.setNext(n3);
        n3.setId(3);
        n3.setNext(n4);
        n4.setId(4);
        n4.setNext(n5);
        n5.setId(5);
        n5.setNext(null);

        return head;
    }

    public static void headInsert(Node head) {
        //构建reverse列表
        Node reverseHead = new Node();
        //构建一个游标不改变原先的链表
        Node headCursor = head;
        Node node;
        while ((node = headCursor.getNext()) != null) {
            //删除原节点
            headCursor.setNext(node.getNext());

            //向reverseHead添加新节点
            // 1.暂存reverseHead的next值
            Node tmp = reverseHead.getNext();
            // 2.将reverseHead的next设置为node
            reverseHead.setNext(node);
            // 3.将新node的next设置为暂存的next
            node.setNext(tmp);
        }
        //构建一个游标不改变原先的链表
        Node reverseHeadCursor = reverseHead;
        Node node1;
        while ((node1 = reverseHeadCursor.getNext()) != null) {
            reverseHeadCursor.setNext(node1.getNext());
            System.out.println(node1.getId());
        }
    }

    public static void rightNow(Node head) {
        //判断当head至少有三个元素的时候才进行翻转操作
        Node cursor;
        Node prev;
        if ((prev = head.getNext()) != null && (cursor = prev.getNext()) != null) {
            while (cursor != null) {
                Node curTmp = cursor.getNext();
                //将prev与cursor后面的元素连起来
                prev.setNext(cursor.getNext());
                //将head的next放到cursor后面
                cursor.setNext(head.getNext());
                //将cursor放到head后面
                head.setNext(cursor);
                //设置下一个移动位置
                cursor = curTmp;
            }
            Node n;
            while ((n = head.getNext()) != null) {
                System.out.println(n.getId());
                head.setNext(n.getNext());
            }
        }
    }
}

class Node {
    public int id;
    public Node next;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
