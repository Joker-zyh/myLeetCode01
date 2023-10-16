package com.yaheng.binaryTree;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int result = 0;
        TreeNode left = root.left;
        if(left != null && left.left == null && left.right == null){
            result = left.val + sumOfLeftLeaves(left);
        }
        result += sumOfLeftLeaves(root.left);
        result += sumOfLeftLeaves(root.right);
        return result;
    }


}
