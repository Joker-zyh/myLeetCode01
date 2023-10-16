package com.yaheng.binaryTree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }
    public static int getMaxDepth(TreeNode cur){
        if (cur == null)
            return 0;
        int left = getMaxDepth(cur.left) + 1;
        int right = getMaxDepth(cur.right) + 1;
        return Math.min(left,right);
    }
}
