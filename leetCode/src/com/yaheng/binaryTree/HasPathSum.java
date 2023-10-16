package com.yaheng.binaryTree;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        boolean left = traversal(root.left,targetSum - root.val);
        boolean right = traversal(root.right,targetSum - root.val);
        return left || right;

    }

    boolean traversal(TreeNode cur,int count){
        if(cur == null)
            return false;
        count -= cur.val;
        if(cur.left == null && cur.right == null && count == 0)
            return true;
        if(cur.left == null && cur.right == null )
            return false;
        traversal(cur.left,count);
        traversal(cur.right,count);
        return false;
    }
}
