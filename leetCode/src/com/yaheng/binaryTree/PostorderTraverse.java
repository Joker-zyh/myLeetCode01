package com.yaheng.binaryTree;

import java.util.*;

public class PostorderTraverse {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer>  list = new ArrayList<>();
//        postorderTraverse(root,list);
//        return list;
//    }
//
//    public static void postorderTraverse(TreeNode cur,List<Integer> list){
//        if (cur == null)
//            return;
//        postorderTraverse(cur.left,list);
//        postorderTraverse(cur.right,list);
//        list.add(cur.val);
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if (cur.left != null)
                stack.push(cur.left);
            if (cur.right != null)
                stack.push(cur.right);
        }
        Collections.reverse(list);
        return list;
    }
}
