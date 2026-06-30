class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] r = new int[9];
        int[] c = new int[9];
        int[] sq = new int[9];

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j]=='.') continue;

                int val = Integer.parseInt(Character.toString(board[i][j]));

                int bit = (2 << val);

                if(((r[i] & bit) > 0 || (c[j] & bit) > 0) || ((sq[(i/3)*3+j/3] & (bit)) > 0)) return false;
                
                r[i] |= bit;
                c[j] |= bit;
                sq[(i/3)*3+j/3] |= bit;
            }
        }
        return true;
    }
}
