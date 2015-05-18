public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int h = board.length;
        int w = board[0].length;
        boolean flag = true;
        for (int i = 0; i < h; ++i){
            HashMap<Character,Boolean> map = new HashMap<Character,Boolean>();
            for (int j = 0; j < w; ++j){
                if(board[i][j] != '.'){
                    if(map.containsKey(board[i][j])){
                        flag = false;
                    }
                    else{
                        map.put(board[i][j],true);
                    }
                    if(!flag){
                        return flag;
                    }
                }
            }
        }
        if(flag){
            for (int i = 0; i < w; ++i){
                HashMap<Character,Boolean> map = new HashMap<Character,Boolean>();
                for (int j = 0; j < h; ++j){
                    if(board[j][i] != '.'){
                        if(map.containsKey(board[j][i])){
                            flag = false;
                        }
                        else{
                            map.put(board[j][i],true);
                        }
                        if(!flag){
                            return flag;
                        }
                    }
                }
            }
        }
        if(flag){
            int num = (int)Math.round(Math.sqrt(h));
            for (int r = 0; r < num; ++r){
                for (int c = 0; c < num; ++c){
                    HashMap<Character,Boolean> map = new HashMap<Character,Boolean>();
                    for (int i = 0; i < num; ++i){
                        for (int j = 0; j < num; ++j){
                            if(board[r*num+i][c*num+j] != '.'){
                                if(map.containsKey(board[r*num+i][c*num+j])){
                                    flag = false;
                                }
                                else{
                                    map.put(board[r*num+i][c*num+j],true);
                                }
                                if(!flag){
                                    return flag;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }
}
