package com.yaheng.backtracking02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution20 {
    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] list :
                chessboard) {
            Arrays.fill(list, '.');
        }
        backTrack(n,chessboard,0);
        return result;
    }

    private void backTrack(int n, char[][] chessboard,int row) {
        if (row == n){
            result.add(getList(chessboard));
            return;
        }

        for (int col = 0;col < n;col++){
            if (isValid(row,col,chessboard,n)){
                chessboard[row][col] = 'Q';
                backTrack(n,chessboard,row+1);
                chessboard[row][col] = '.';
            }
        }
    }

    private boolean isValid(int row, int col, char[][] chessboard, int n) {
        //检查列
        for (int i = row - 1;i >= 0;i--){
            if (chessboard[i][col] == 'Q'){
                return false;
            }
        }

        //检查45°
        for (int i=row-1,j=col+1; i>=0 && j<n;i--,j++){
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }

        //检查135°
        for (int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    private List<String> getList(char[][] chessboard){
        List<String> list = new ArrayList<>();
        for (char[] arr :
                chessboard) {
            list.add(String.copyValueOf(arr));
        }
        return list;
    }
    
    
}
