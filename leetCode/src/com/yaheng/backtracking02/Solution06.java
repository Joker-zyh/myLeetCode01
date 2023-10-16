package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution06 {
    private List<List<String>> list = new ArrayList<>();
    private LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return list;
    }

    private void backtracking(String s,int startIndex){
        if (startIndex == s.length()){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < s.length() ; i++) {
            if (isHui(s,startIndex,i)){
                String substring = s.substring(startIndex, i + 1);
                path.add(substring);
            }else {
                continue;
            }
            backtracking(s,i + 1);
            path.removeLast();
        }
    }

    private boolean isHui(String string,int l,int r){
        while (l < r){
            if (string.charAt(l) != string.charAt(r)){
                return false;
            }
        }
        return true;
    }
}
