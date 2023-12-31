package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraverse2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode node = stack.peek();
            stack.pop();
            list.add(node.val);

            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }


        }
        return list;
    }
}
