package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        order(root,list,0);
        Collections.reverse(list);
        return list;
    }

    public static void order(TreeNode cur,List<List<Integer>> list,int depth){
        depth++;
        if (list.size() < depth){
            List<Integer> arr = new ArrayList<>();
            list.add(arr);
        }
        if (cur.left != null)
            order(cur.left,list,depth);
        if (cur.right != null)
            order(cur.right,list,depth);
        list.get(depth - 1).add(cur.val);
    }
}
