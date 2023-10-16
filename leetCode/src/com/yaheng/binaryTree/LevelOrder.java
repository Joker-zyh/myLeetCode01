package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            List<Integer> arr = new ArrayList<>();
            while (size > 0){
                TreeNode cur = deque.poll();
                arr.add(cur.val);
                if (cur.left != null)
                    deque.offer(cur.left);
                if (cur.right != null)
                    deque.offer(cur.right);
                size--;
            }
            list.add(arr);
        }
        return list;

//        List<List<Integer>> list = new ArrayList<>();
//        if (root == null)
//            return list;
//        order(root,list,0);
//        return list;
//    }
//
//    public static void order(TreeNode cur,List<List<Integer>> list,int depth){
//        depth++;
//        if (list.size() < depth){
//            List<Integer> arr = new ArrayList<>();
//            list.add(arr);
//        }
//        list.get(depth - 1).add(cur.val);
//        if (cur.left != null)
//            order(cur.left,list,depth);
//        if (cur.right != null)
//            order(cur.right,list,depth);

    }
}
