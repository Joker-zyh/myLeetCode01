package com.yaheng.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Partition {
    List<List<String>> list = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return list;
    }
    
    void backtracking(String s,int startIndex){
        //
        if(startIndex>= s.length()){
            list.add(new ArrayList<>(path));
            return;
        }
        //
        for (int i = startIndex; i < s.length(); i++) {
            if(isHui(s,startIndex,i)){
                path.add(s.substring(startIndex,i + 1));
            }else
                continue;
            backtracking(s,i + 1);
            path.removeLast();
        }
    }

    boolean isHui(String s1,int left,int right){
        while (left < right){
            if (s1.charAt(left) != s1.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
