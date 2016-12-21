package com.liupeng.example24parentid;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liupeng on 2016/12/20.
 */
public class TestParentID {
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();

        n1.setId("1");n1.setParentId("0");n1.setChildren(new ArrayList<Node>());
        n2.setId("3");n2.setParentId("1");n2.setChildren(new ArrayList<Node>());
        n3.setId("2");n3.setParentId("1");n3.setChildren(new ArrayList<Node>());
        n4.setId("4");n4.setParentId("2");n4.setChildren(new ArrayList<Node>());
        n5.setId("5");n5.setParentId("2");n5.setChildren(new ArrayList<Node>());
        n6.setId("6");n6.setParentId("3");n6.setChildren(new ArrayList<Node>());
        n7.setId("7");n7.setParentId("4");n7.setChildren(new ArrayList<Node>());

        List<Node> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);
        list.add(n7);

        generateTree(list);
    }

    public static void generateTree(List<Node> nodeList){
        Map<String,Node> map = new HashMap();
        for(Node node : nodeList){
            map.put(node.getId(),node);
        }
        for(Node n : nodeList){
            Node parent = map.get(n.getParentId());
            if(parent!=null){
                parent.getChildren().add(n);
            }
        }
        Map<String,Node> target = new HashMap<>();
        target.put("1",map.get("1"));
        System.out.println(JSON.toJSONString(target));
    }

}
class Node{
    public String id;
    public String parentId;
    public List<Node> children;
    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
