package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution03 {
    private List<String> list = new ArrayList<>();
    private StringBuilder path = new StringBuilder();
    String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return list;
        }
        backTracking(digits,0);
        return list;
    }

    public void backTracking(String digits,int startIndex){
        if (digits.length() == path.length()){
            list.add(path.toString());
            return;
        }

        String s = letters[digits.charAt(startIndex) - '0'];
        for (int i = 0; i < s.length();i++){
            path.append(s.charAt(i));
            backTracking(digits,startIndex + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
