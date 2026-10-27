class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            boolean[] seen = new boolean[10];
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                int num = board[r][c] - '0';
                if (seen[num]) return false;
                seen[num] = true;
            }
        }
        for (int c = 0; c < 9; c++) {
            boolean[] seen = new boolean[10];
            for (int r = 0; r < 9; r++) {
                if(board[r][c] == '.') continue;
                int num = board[r][c] - '0';
                if (seen[num]) return false;
                seen[num] = true;
            }
        }
        for (int box = 0; box < 9; box++) {
            boolean[] seen = new boolean[10];
            int startRow = (box/3) * 3;
            int startCol = (box/3) * 3;
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    char val = board[startRow + r][startCol + c];
                    if (val == '.') continue;
                    int num = val - '0';
                    if (seen[num]) return false;
                    seen[num] = true;
                }
            }
        }
        return true;
    }
}
