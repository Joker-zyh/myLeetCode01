package com.yaheng.string;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int [] next = new int[needle.length()];
        getNext(next,needle);

        int j = -1;//模式串

        for (int i = 0; i < h.length; i++) {
            while (j >= 0 && h[i] != n[j + 1]){
                j = next[j];
            }
            if (h[i] == n[j + 1]){
                j++;
            }
            if (j == (n.length - 1)){
                return i - n.length + 1;
            }
        }



        return -1;


    }

    public void getNext(int[] next,String needle){
        char[] arr = needle.toCharArray();
        int j = -1;
        next[0] = j;
        for (int i = 1; i < arr.length; i++) {
            while (j >= 0 && arr[j + 1] != arr[i]){
                j = next[j];
            }
            if (arr[j + 1] == arr[i]){
                j++;
            }
            next[i] = j;
        }

    }
}
