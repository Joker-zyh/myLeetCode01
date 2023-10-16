package com.yaheng.binaryTree;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return false;
        return compare(root.left,root.right);

    }

//    public static boolean compare(TreeNode left,TreeNode right){
//        if (left == null && right != null)
//            return false;
//        if (left != null && right == null)
//            return false;
//        if (left == null && right == null)
//            return true;
//        if (left.val != right.val)
//            return false;
//        boolean outside = compare(left.left,right.right);
//        boolean inside = compare(left.right,right.left);
//        boolean result = outside && inside;
//        return result;
//    }

    public static boolean compare(TreeNode left,TreeNode right){
        if (left == null && right != null)
            return false;
        if (left != null && right == null)
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
