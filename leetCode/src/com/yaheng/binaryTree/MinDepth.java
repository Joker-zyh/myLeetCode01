package com.yaheng.binaryTree;

public class MinDepth {
    public int minDepth(TreeNode root) {
        return getDepth(root);
    }
    public static int getDepth(TreeNode cur){
        if (cur == null)
            return 0;
        int left = getDepth(cur.left);
        int right = getDepth(cur.right);

        if (cur.left != null && cur.right == null)
            return 1 + left;
        if (cur.right != null && cur.left == null)
            return 1 + right;
        return Math.min(left,right)+1;
    }
}
