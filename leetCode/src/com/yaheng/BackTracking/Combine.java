package com.yaheng.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combine {

    //for循环是横向遍历，回溯是纵向遍历

    List<List<Integer>> list = new ArrayList<>();
    //List<Integer> list1 = new ArrayList<>();
    LinkedList<Integer> list1 = new LinkedList<>();

    public List<List<Integer>> combine(int n,int k) {
        backTracking(n,k,1);
        return list;
    }

    void backTracking(int n, int k,int startIndex){
        //确定终止条件
        if (list1.size() == k){
            list.add(new ArrayList<>(list1));
            return;
        }
        for (int i = startIndex; i <= n - (k - list1.size()) + 1; i++) {
            //处理节点
            list1.add(i);
            backTracking(n,k,i+1);
            //弹出
            list1.removeLast();
        }

    }

}
