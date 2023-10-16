package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution02 {
    public List<List<Integer>> list = new ArrayList<>();
    public LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k,n,1,0);
        return list;
    }

    public void backTracking(int k, int n,int startIndex,int sum){
        if (path.size() > k){
            return;
        }
        if(path.size() == k){
            if (sum == n){
                list.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i <= 9 - (k -path.size()) + 1;i++){
            sum += i;
            path.add(i);
            backTracking(k,n,i+1,sum);
            path.removeLast();
            sum-=i;
        }
    }
}
