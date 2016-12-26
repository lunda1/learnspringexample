package com.liupeng.example27tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by liupeng on 2016/12/23.
 */
public class TestTree {
    public static void main(String[] args) {
        TreeNode root = generateTree();
        traverseDFS(root);
    }

    public static void traverseDFS(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        if (root != null) {
            stack.push(root);
        }
        TreeNode node = root;
        while(node.getChildren()!=null&&!node.getChildren().isEmpty()){
            node = stack.pop();
            System.out.println("node: "+node.getId());
            for (TreeNode treeNode : node.getChildren()) {
                stack.push(treeNode);
                stack.push(treeNode);
            }
        }
    }

    public static TreeNode generateTree() {
        TreeNode root = new TreeNode();
        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode();
        TreeNode n3 = new TreeNode();
        TreeNode n4 = new TreeNode();
        TreeNode n5 = new TreeNode();
        TreeNode n6 = new TreeNode();

        List<TreeNode> children1 = new ArrayList<>();
        children1.add(n2);
        children1.add(n3);
        List<TreeNode> children2 = new ArrayList<>();
        children2.add(n4);
        children2.add(n5);
        List<TreeNode> children4 = new ArrayList<>();
        children4.add(n6);

        //构建原始列表
        n1.setId(1);
        n1.setName("node1");
        n1.setParentId(0);
        n1.setChildren(children1);
        n2.setId(2);
        n2.setName("node2");
        n2.setParentId(1);
        n2.setChildren(children2);
        n3.setId(3);
        n3.setName("node3");
        n3.setParentId(1);
        n4.setId(4);
        n4.setName("node4");
        n4.setParentId(2);
        n4.setChildren(children4);
        n5.setId(5);
        n5.setName("node5");
        n5.setParentId(2);
        n6.setId(6);
        n6.setName("node6");
        n6.setParentId(4);

        root = n1;

        return root;
    }
}

class TreeNode {
    public int id;
    public String name;
    public int parentId;
    List<TreeNode> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
