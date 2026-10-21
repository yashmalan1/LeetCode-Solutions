class Solution {
    public boolean isValidSudoku(char[][] board) {
        //row check
        for(int i=0;i<9;i++){
            boolean unique[]=new boolean[9];
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int d=board[i][j]-'1';
                if(unique[d]){
                    return false;
                }
                unique[d]=true;
            }
        }
        //column check
        for(int j=0;j<9;j++){
            boolean unique[]=new boolean[9];
            for(int i=0;i<9;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                int d=board[i][j]-'1';
                if(unique[d]){
                    return false;
                }
                unique[d]=true;
            }
        }

        //boxes check
        for(int r=0;r<9;r+=3){
            for(int c=0;c<9;c+=3){
                boolean unique[]=new boolean[9];
                for(int i=r;i<r+3;i++){
                    for(int j=c;j<c+3;j++){
                        if(board[i][j]=='.'){
                            continue;
                        }
                        int d=board[i][j]-'1';
                        if(unique[d]){
                            return false;
                        }
                        unique[d]=true;
                    }
                }
            }
        }
        return true;
    }
}