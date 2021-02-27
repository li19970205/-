import java.util.Arrays;

//让字符串成为回文串的最少次数
public class L1312 {
    public int minInsertions(String s) {
        if(s.length()==0) return 1;
        //定义dp数组，dp(i)(j)定义为字串s(i...j)构成回文串所需的最少操作次数
        int[][] dp=new int[s.length()][s.length()];
        //base case
        for (int i=0;i<s.length();i++) dp[i][i]=0;

        //反向遍历
        for(int i=s.length()-2;i>=0;i--){
            for(int j=i+1;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)) dp[i][j]=dp[i+1][j-1];
                else dp[i][j]=Math.min(dp[i][j-1],dp[i+1][j])+1;
            }
        }
        return dp[0][s.length()-1];

    }


    //解法二，二维数组转换为1维数组
    public int minInsertions01(String s) {
        if(s.length()==0) return 1;
        //定义dp数组，dp(i)(j)定义为字串s(i...j)构成回文串所需的最少操作次数
        int[] dp=new int[s.length()];
        //base case
        Arrays.fill(dp,0);
        //反向遍历
        for(int i=s.length()-2;i>=0;i--){
            int pre=0;
            for(int j=i+1;j<s.length();j++){
                int tem=dp[j];
                if (s.charAt(i)==s.charAt(j)) dp[j]=pre;
                else dp[j]=Math.min(dp[j-1],dp[j])+1;
                pre=tem;
            }
        }
        return dp[s.length()-1];

    }
}