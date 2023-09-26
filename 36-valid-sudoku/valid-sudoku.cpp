class Solution {
private:
    bool is_valid_row(vector<vector<char>>& board, int &ind){
        set<char> s;
        for(int i=0; i<9; i++){
            if(board[ind][i] != '.'){
                if(s.find(board[ind][i]) != s.end()){
                    return false;
                }
                s.insert(board[ind][i]);
            }
        }
        return true;
    }

    bool is_valid_box(vector<vector<char>>& board, int &start_row, int &start_col ){
        set<char> s;
        int end_row = start_row + 3;
        int end_col = start_col + 3;
        for(int i=start_row; i<end_row; i++){
            for(int j = start_col; j<end_col; j++){
                if(board[i][j] != '.'){
                    if(s.find(board[i][j]) != s.end()){
                        return false;
                    }
                    s.insert(board[i][j]);
                }
            }
        }
        return true;
    }

    bool is_valid_col(vector<vector<char>>& board, int &ind){
        set<char> s;
        for(int i=0; i<9; i++){
            if(board[i][ind] != '.'){
                if(s.find(board[i][ind]) != s.end()){
                    return false;
                }
                s.insert(board[i][ind]);
            }
        }
        return true;
    }
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        int row = board.size();
        int column = board[0].size();
        for(int i=0; i<row; i++){
            if(!is_valid_row(board,i)){
                return false;
            }
        }
        for(int i=0; i<column; i++){
            if(!is_valid_col(board,i)){
                return false;
            }
        }

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                if(!is_valid_box(board,i,j)){
                    return false;
                }
            }
        }

        return true;
    }
};