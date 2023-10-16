package com.yaheng.backtracking02;

public class Solution21 {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }

    private boolean backtrack(char[][] board) {
        for (int i = 0;i < 9;i++){
            for (int j = 0; j < 9;j++){
                if (board[i][j] != '.'){
                    continue;
                }

                for (char val = '1'; val <= '9';val++){
                    if (isValid(i,j,val,board)){
                        board[i][j] = val;
                        if (backtrack(board)){
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isValid(int i, int j, char val, char[][] board) {
        //检查列
        for (int row = 0;row < 9;row++){
            if (board[row][j] == val){
                return false;
            }
        }

        //检查行
        for (int col = 0;col < 9;col++){
            if (board[i][col] == val){
                return false;
            }
        }

        //检查所在大方格
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;
        for (int row = startRow;row < startRow + 3;row++){
            for (int col = startCol;col < startCol + 3;col++){
                if (board[row][col] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}
