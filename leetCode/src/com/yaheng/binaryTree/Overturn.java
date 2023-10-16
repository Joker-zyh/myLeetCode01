package com.yaheng.binaryTree;

public class Overturn {
    public static TreeNode overturn(TreeNode root){
        if (root == null)
            return root;
        turn(root);
        return root;
    }

    public static void turn(TreeNode cur){
        if (cur == null)
            return;
        TreeNode tmp = cur.left;
        cur.left = cur.right;
        cur.right = tmp;
        turn(cur.left);
        turn(cur.right);
    }
}
