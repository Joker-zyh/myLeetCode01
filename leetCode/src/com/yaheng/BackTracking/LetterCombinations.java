package com.yaheng.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
    List<String> list = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return list;
        }
        backTracking(digits,0);
        return list;
    }

    void backTracking(String digits,int startIndex){
        if(path.length() == digits.length()){
            list.add(path.toString());
            return;
        }
        String s = letters[digits.charAt(startIndex) - '0'];
        for(int i = 0;i < s.length();i++){
            path.append(s.charAt(i));
            backTracking(digits,startIndex + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}












