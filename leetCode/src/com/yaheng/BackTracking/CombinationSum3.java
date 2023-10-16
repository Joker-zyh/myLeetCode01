package com.yaheng.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
    List<List<Integer>> list = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    //n 为和，k为个数
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k,n,1,0);
        return list;
    }

    void backTracking(int k ,int n,int startIndex,int sum){
        if(k < path.size())
            return;
        //终止条件
        if(k == path.size()){
            if(n == sum){
                list.add(new ArrayList<>(path));
                return;
            }
        }
        //处理节点
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1 ; i++) {
           path.add(i);
           sum += i;
           backTracking(k,n,i + 1,sum);
            //回弹
            path.removeLast();
            sum -= i;
        }

    }
}
