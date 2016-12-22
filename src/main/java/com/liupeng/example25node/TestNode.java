package com.liupeng.example25node;

/**
 * description 单链表顾名思义就是只有一条链，即每个对象只有一个next对象链接到下个对象
 * Created by liupeng on 2016/12/22.
 */
public class TestNode {
    public static void main(String[] args) {
        Node head = new Node();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();

        //构建原始列表
        head.setNext(n1);
        n1.setId(1);n1.setNext(n2);
        n2.setId(2);n2.setNext(n3);
        n3.setId(3);n3.setNext(n4);
        n4.setId(4);n4.setNext(n5);
        n5.setId(5);n5.setNext(null);

        //构建reverse列表
        Node reverseHead = reverse(head);
        //构建一个游标不改变原先的链表
        Node reverseHeadCursor = reverseHead;
        Node node;
        while((node = reverseHeadCursor.getNext())!=null){
            reverseHeadCursor.setNext(node.getNext());
            System.out.println(node.getId());
        }

    }

    public static Node reverse(Node head){
        //构建reverse列表
        Node reverseHead = new Node();
        //构建一个游标不改变原先的链表
        Node headCursor = head;
        Node node;
        while((node = headCursor.getNext())!=null){
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
        return reverseHead;
    }
}
class Node{
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
