package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null)
            return arr;
        List<List<Integer>> list = new ArrayList<>();
        order(root,list,0);
        for (int i = 0; i < list.size(); i++) {
            List<Integer> tmp = list.get(i);
            arr.add(tmp.get(tmp.size() - 1 ));
        }
        return arr;

    }

    public static void order(TreeNode cur,List<List<Integer>> list,int depth){
        depth++;
        if (list.size() < depth){
            List<Integer> arr = new ArrayList<>();
            list.add(arr);
        }
        list.get(depth - 1).add(cur.val);
        if (cur.left != null)
            order(cur.left,list,depth);
        if (cur.right != null)
            order(cur.right,list,depth);

    }
}
