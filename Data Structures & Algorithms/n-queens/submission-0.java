class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        func(0,board,ans,n);
        return ans;
    }
    public void func(int col,char[][] board,List<List<String>>ans,int n){
        if(col==n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row=0;row<n;row++){
            if(issafe(col,row,board,n)){
                board[row][col]='Q';
                func(col+1,board,ans,n);
                board[row][col]='.';
            }
        }
    }
    Boolean issafe(int col,int row,char[][]board,int n){
        int r=row;
        int c=col;
        while(col>=0&&row>=0){
            if(board[row][col]=='Q') return false;
            col--;
            row--;
        }
        col=c;
        row=r;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        col=c;
        row=r;
        while(row<n && col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
}
