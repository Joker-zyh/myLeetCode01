package com.yaheng.binaryTree;

import java.util.Deque;
import java.util.LinkedList;

public class FindBottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            LinkedList<Integer> arr = new LinkedList<>();
            while (size-- > 0){
                TreeNode cur = deque.poll();
                arr.add(cur.val);
                if(cur.left != null)
                    deque.offer(cur.left);
                if (cur.right != null)
                    deque.offer(cur.right);
            }
            list.add(arr);
        }
        return list.getLast().getFirst();
    }
}
