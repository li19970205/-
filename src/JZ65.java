//矩阵中的路径
public class JZ65 {
    public boolean hasPath (String matrix, int rows, int cols, String str) {
      char[] words=str.toCharArray();
      char[] board=matrix.toCharArray();
      boolean[] boo=new boolean[matrix.length()];
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
              if(dfs(board,words,rows,cols,i,j,0)) return true;
          }
      }
      return false;
    }

    boolean dfs(char[] board,char[] word,int rows,int cols,int i,int j,int k){
        int nums=i*cols+j; //由于是一维数组的关系
        if(i>=rows || i<0 || j>=cols || j<0 || board[nums]!=word[k] ) return false;
        if(k==word.length-1) return true;  //这里相当于将word字符串已经全部访问过了，且相等了
        board[nums]='\0'; //表示该字符已经访问过了，不能再重新访问了
        boolean res=dfs(board,word,rows,cols,i+1,j,k+1) ||dfs(board,word,rows,cols,i-1,j,k+1) ||
        dfs(board,word,rows,cols,i,j-1,k+1) ||  dfs(board,word,rows,cols,i,j+1,k+1);
        board[nums]=word[k];  //返回false时，回退
        return res;

    }

}