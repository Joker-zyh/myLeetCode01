package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NlevelOrder {
//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> list = new ArrayList<>();
//        if (root == null)
//            return list;
//        Deque<Node> deque = new LinkedList<>();
//        deque.offer(root);
//        while (!deque.isEmpty()){
//            int size = deque.size();
//            List<Integer> arr = new ArrayList<>();
//            while (size > 0){
//                Node cur = deque.poll();
//                arr.add(cur.val);
//                for (int i = 0; i < cur.children.size(); i++) {
//                    if (cur.children.get(i) != null)
//                        deque.offer(cur.children.get(i));
//                }
//                size--;
//            }
//            list.add(arr);
//        }
//        return list;
//    }
}
