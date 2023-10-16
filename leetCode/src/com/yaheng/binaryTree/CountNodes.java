package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CountNodes {
    public int countNodes(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list.size();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            TreeNode cur = deque.poll();
            list.add(cur.val);
            if (cur.right != null)
                deque.offer(cur.right);
            if (cur.left != null)
                deque.offer(cur.left);

        }
        return list.size();
    }
}
