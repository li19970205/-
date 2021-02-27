//最长回文子序列
public class L516 {
    public int longestPalindromeSubseq(String s) {
        if(s.length()==0) return 0;
        //定义dp[i][j]为字符串中从i到j中的最长回文子序列
        int[][] dp=new int[s.length()][s.length()];
        //base case
        for(int i=0;i<s.length();i++) dp[i][i]=1;

        //接着反向遍历
        for(int i=s.length()-2;i>=0;i--){
            for (int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)) dp[i][j]=dp[i+1][j-1]+2;
                else dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][s.length()-1];

    }
}

//进行状态压缩，即将二维数据转换为1维数组
public int longestPalindromeSubseq01(String s) {
    if(s.length()==0) return 0;
   int[] dp=new int[s.length()];
    //base case
    for(int i=0;i<s.length();i++) dp[i]=1;
    //接着反向遍历
    for(int i=s.length()-2;i>=0;i--){
        int pre=0;
        for (int j=i+1;j<s.length();j++){
            int tem=dp[j];
            if(s.charAt(i)==s.charAt(j)) dp[j]=pre+2;
            else dp[j]=Math.max(dp[j],dp[j-1]);
            pre=tem;
        }
    }
    return dp[s.length()-1];

}
}