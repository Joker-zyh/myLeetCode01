package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AverageOfLevels {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> arr = new ArrayList<>();
//        if (root == null)
//            return arr;
//        Deque<TreeNode> deque = new LinkedList<>();
//        deque.offer(root);
//        while (!deque.isEmpty()){
//            int size = deque.size();
//            Double sum = 0.0;
//            while (size>0){
//                TreeNode node = deque.poll();
//                sum+=node.val;
//                if (node.left != null)
//                    deque.offer(node.left);
//                if (node.right != null)
//                    deque.offer(node.right);
//                size--;
//            }
//            arr.add(sum/size);
//        }
//        return arr;
//
//    }


    public List<Integer> largestValues(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null)
            return arr;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            int max = Integer.MIN_VALUE;
            while (size>0){
                TreeNode cur = deque.poll();
                max = Math.max(max, cur.val);
                if (cur.left != null)
                    deque.offer(cur.left);
                if (cur.right != null)
                    deque.offer(cur.right);
                size--;
            }
            arr.add(max);
        }
        return arr;
    }
}
