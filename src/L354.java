import java.util.Arrays;
import java.util.Comparator;

//题目描述：俄罗斯套娃信封问题
public class L354 {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length==0) return 0;
        //这里首先对二维数组进行排序，按宽度升序，如果宽度相同时，高度按降序
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //这里o2[1]-o1[1]表示数组第二维元素按降序排列，如果为o1[1]-o2[1]表示升序排列,o1[0]-o2[0]表示对第一维元素按升序
                return o1[0]==o2[0]?o2[1]-o1[1]:o1[0]-o2[0];
            }
        });
        int result=lis(envelopes);
        return result;

    }
    int lis(int[][] array){
      int[] dp=new int[array.length];
      Arrays.fill(dp,1);
        for(int i=1;i<array.length;i++){
            for(int j=i-1;j>=0;j--){
                if (array[i][1]>array[j][1]) {
                   dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }
        int result=dp[0];
        for (int i=1;i<dp.length;i++){
            result=Math.max(result,dp[i]);
        }
        return result;
    }
}