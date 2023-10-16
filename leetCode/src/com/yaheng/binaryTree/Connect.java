package com.yaheng.binaryTree;

import java.util.Deque;
import java.util.LinkedList;

public class Connect {
    public Node connect(Node root) {
        if (root == null)
            return root;
        Deque<Node> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            while (size>0){
                Node cur = deque.poll();
                if (size > 1){
                    cur.next = deque.peek();
                }
                if (cur.left != null)
                    deque.offer(cur.left);
                if (cur.right != null)
                    deque.offer(cur.right);
                size--;
//                if (cur.left != null){
//                    if (size > 1) {
//                        cur.left.next = cur.right;
//                        cur.right.next = cur.next.left;
//                    }else {
//                        cur.next = null;
//                        cur.left.next = cur.right;
//                        cur.right.next = null;
//                    }
//                    deque.offer(cur.left);
//                    deque.offer(cur.right);
//                    size--;
//                }

            }
        }
        return root;
    }
}
