package com.yaheng.binaryTree;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (getMaxDepth(root) == -1)
            return false;
        return true;

    }
    public static int getMaxDepth(TreeNode cur){
        if (cur == null)
            return 0;
        int left = getMaxDepth(cur.left);
        if (left == -1)
            return -1;
        int right = getMaxDepth(cur.right);
        if (right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        else
            return Math.max(left,right) + 1;
    }
}
