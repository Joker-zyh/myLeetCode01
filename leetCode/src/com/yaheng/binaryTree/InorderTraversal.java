package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//左中右
public class InorderTraversal {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        inorderTraverse(root,result);
//        return result;
//    }
//
//    void inorderTraverse(TreeNode cur, List<Integer> result){
//       if (cur == null)
//           return;
//       inorderTraverse(cur.left,result);
//       result.add(cur.val);
//       inorderTraverse(cur.right,result);
//    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}
