package com.yaheng.hashTable;

public class Solution01 {
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (int i = 0;i <s.length();i++){
            record[s.charAt(i) - 'a']++;
        }

        for (int i = 0;i < t.length();i++){
            record[t.charAt(i) - 'a']--;
        }
        for (int num :
                record) {
            if (num != 0){
                return false;
            }
        }
        return true;
    }

    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] table01 = new int[26];
        int[] table02 = new int[26];

        getHashTable(s,table01);
        getHashTable(t,table02);

        for (int i = 0;i < table01.length;i++){
            if (table01[i] != table02[i]){
                return false;
            }
        }
        return true;
    }

    private void getHashTable(String string, int[] table) {
        for (int i = 0;i < string.length();i++){
            int index = string.charAt(i) - 'a';
            table[index]++;
        }
    }*/


}
