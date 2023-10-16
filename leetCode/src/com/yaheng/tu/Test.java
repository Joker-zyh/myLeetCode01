package com.yaheng.tu;

public class Test {
    public static void main(String[] args) {
        com.yaheng.tu.Solution02 solution01 = new Solution02();
        char[][] arr = {new char[]{'1','1','1','1','0'},new char[]{'1','1','0','1','0'},
                new char[]{'1','1','0','0','0'},new char[]{'0','0','0','0','0'}};
        solution01.numIslands(arr);
    }
}
