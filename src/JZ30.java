//连续子数组的最大和
public class JZ30 {
    public int FindGreatestSumOfSubArray(int[] array) {
      int[] dp=new int[array.length];
      dp[0]=array[0];
      for (int i=1;i<array.length;i++){
          dp[i]=Math.max(array[i],dp[i-1]+array[i]);
      }

      //遍历dp数组找出最大值
        int res=dp[0];
      for (int i=1;i<dp.length;i++){
          res=Math.max(res,dp[i]);
      }
      return res;

    }



//解法二 空间复杂度降为o(1)
public int FindGreatestSumOfSubArray1(int[] array) {
    int dp_0=array[0],dp_1=0,res=array[0];
    for(int i=1;i<array.length;i++) {
        dp_1=Math.max(array[i],dp_0+array[i]);
        res=Math.max(res,dp_1);
        dp_0=dp_1;
    }
    return res;



}
}
