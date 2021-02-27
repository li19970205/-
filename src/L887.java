import java.util.HashMap;

//鸡蛋掉落
public class L887 {
        HashMap<String,Integer> memo=new HashMap<>();
       public int superEggDrop(int K, int N) {
        return dp(K,N);
    }
    int dp(int k,int n){
           //base case
        if(k==1) return n;
        if(n==0) return 0;
        int res=Integer.MAX_VALUE;
        String key=k+""+n;
        if (memo.containsKey(key)) return memo.get(key);
        //选择
        for(int i=1;i<=n;i++){
            res=Math.min(res,Math.max(dp(k-1,i-1),dp(k,n-i))+1);
        }
        memo.put(key,res);
        return res;
    }
}
