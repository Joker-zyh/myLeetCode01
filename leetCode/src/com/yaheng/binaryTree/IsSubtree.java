package com.yaheng.binaryTree;

import com.yaheng.stack.Stack;

public class IsSubtree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(compare(cur,subRoot))
                return true;
            if (cur.left != null)
                stack.push(cur.left);
            if (cur.right != null)
                stack.push(cur.right);
        }
        return false;
    }
    public static boolean compare(TreeNode left,TreeNode right){
        if (left == null && right != null)
            return false;
        if (left!= null && right == null)
            return false;
        if (left == null && right == null)
            return true;
        if (left.val != right.val)
            return false;
        boolean leftside = compare(left.left,right.left);
        boolean rightside = compare(left.right,right.right);
        return leftside && rightside;
    }

}
