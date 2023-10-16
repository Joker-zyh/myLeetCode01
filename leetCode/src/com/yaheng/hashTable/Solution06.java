package com.yaheng.hashTable;

public class Solution06 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hashTable = new int[26];
        for (int i = 0; i < magazine.length();i++){
            int index = magazine.charAt(i) - 'a';
            hashTable[index]++;
        }

        for (int i = 0;i <ransomNote.length();i++){
            int index = ransomNote.charAt(i) - 'a';
            hashTable[index]--;
            if (hashTable[index] < 0){
                return false;
            }
        }

        /*for(int num: hashTable){
            if (num < 0){
                return false;
            }
        }*/
        return true;
    }
}
