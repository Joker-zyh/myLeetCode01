package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.List;

public class Solution07 {
    private List<String> list = new ArrayList<>();
    private StringBuilder sb;
    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12){
            return list;
        }
        sb = new StringBuilder(s);
        backTracking(sb,0,0);
        return list;
    }

    private void backTracking(StringBuilder s,int startIndex,int pointNum){
        if (pointNum == 3){
            if (isValid(sb,startIndex,sb.length() - 1)){
                list.add(sb.toString());
            }
            return;
        }

        for (int i = startIndex;i < s.length();i++){
            if (isValid(sb,startIndex,i)){
                sb.insert(i+1,'.');
                pointNum += 1;
            }else {
                return;
            }
            backTracking(s,i + 2,pointNum);
            sb.deleteCharAt(i + 1);
            pointNum -= 1;
        }
    }

    private boolean isValid(StringBuilder s,int start,int end){
        if (start > end){
            return false;
        }
        if (s.charAt(start) == '0' && start != end){
            return false;
        }
        if (Integer.parseInt(s.substring(start,end + 1)) > 255){
            return false;
        }
        return true;
    }
}
