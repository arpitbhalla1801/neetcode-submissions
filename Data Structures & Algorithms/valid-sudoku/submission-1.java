class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j]=='.') continue;
                if(!set.add(Integer.parseInt(Character.toString(board[i][j])))) return false;
            }
        }
        for(int i=0;i<board.length;i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<board[i].length;j++) {
                if(board[j][i]=='.') continue;
                if(!set.add(Integer.parseInt(Character.toString(board[j][i])))) return false;
            }
        }
        List<Set<Integer>> list = new ArrayList<>();
        for(int i=0; i<9; i++) list.add(new HashSet<>());
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j]=='.') continue;
                int n = Integer.parseInt(Character.toString(board[i][j]));
                int in = (i/3)*3+(j/3);
                if(!(list.get(in)).add(n)) return false;
            }
        }
        return true;
    }
}