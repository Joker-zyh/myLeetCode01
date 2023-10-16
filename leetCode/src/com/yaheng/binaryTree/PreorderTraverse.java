package com.yaheng.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraverse {
    //中左右
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraverse(root,result);
        return result;
    }

    void preorderTraverse(TreeNode cur,List<Integer> result){
        if (cur == null)
            return;
        result.add(cur.val);
        preorderTraverse(cur.left,result);
        preorderTraverse(cur.right,result);
    }
}
