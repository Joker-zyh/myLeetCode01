package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;
        List<Integer> arr = new ArrayList<>();
        paths(root,list,arr);
        return list;
    }
    public static void paths(TreeNode cur,List<String> list,List<Integer> arr){
        arr.add(cur.val);
        if (cur.left == null && cur.right != null){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.size() - 1; i++) {
                sb.append(arr.get(i)).append("->");
            }
            sb.append(arr.get(arr.size() - 1));
            list.add(sb.toString());
            return;
        }
        if (cur.left != null){
            paths(cur.left,list,arr);
            arr.remove(arr.size() - 1);
        }
        if (cur.right != null) {
            paths(cur.right, list, arr);
            arr.remove(arr.size() - 1);
        }
    }




//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> list = new ArrayList<>();
//        if (root == null)
//            return list;
//        String s = "";
//        boolean flag = true;
//        paths(list,root,s,flag);
//        return list;
//    }
//    public static void paths(List<String> list,TreeNode cur,String s,boolean flag){
//        if (flag){
//            s += cur.val;
//            flag = false;
//        }else {
//            s = s + "->" + cur.val;
//        }
//        if (cur.left == null && cur.right == null){
//            list.add(s);
//        }
//        if (cur.left != null){
//            paths(list,cur.left,s,flag);
//        }
//        if (cur.right != null){
//            paths(list,cur.right,s,flag);
//        }
//    }

}
