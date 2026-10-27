class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') {
                    continue;
                }
                String rowKey = "row"+r+"_"+val;
                String colKey = "col"+c+"_"+val;
                String boxKey = "box"+(r/3)*3+(c/3)+"_"+val;
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
