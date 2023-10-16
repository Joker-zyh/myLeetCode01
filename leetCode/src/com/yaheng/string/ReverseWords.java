package com.yaheng.string;

public class ReverseWords {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverse(arr,0,arr.length - 1);

//        int front = 0;
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            if (arr[i] != ' ' && (i == 0 || arr[i - 1] == ' ')){
//                int j = i;
//                while (arr[j] != ' '){
//                    tmp[front++] = arr[j++];
//                    if (j == arr.length)
//                        break;
//                }
//                    tmp[front++] = ' ';
//
//            }
//        }
//        return new String(tmp,0,front - 1);
        int fast = 0;
        int slow = 0;
        for (fast = 0;fast < arr.length;fast++){
            if (arr[fast] != ' '){
                if (slow != 0){
                    arr[slow++] = ' ';
                }
                while (fast < arr.length && arr[fast] != ' ')
                    arr[slow++] = arr[fast++];
            }
        }

        int front = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length ||arr[end] == ' '){
                reverse(arr,front,end - 1);
                front = end + 1;
        }}


        return new String(arr);
    }
    public void reverse(char[] s,int front,int tail){
        while (front < tail) {
            char tmp = s[front];
            s[front] = s[tail];
            s[tail] = tmp;
            front++;
            tail--;
        }
    }
}
