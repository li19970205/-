import java.util.HashMap;

//正则表达式匹配
public class JZ52 {
    HashMap<String,Boolean> memo=new HashMap<String, Boolean>();
    public boolean match(char[] str, char[] pattern)
    {
        //定义dp函数，表示str字符串中第I个元素开始，与pattern中第j个元素开始，是否匹配
        return dp(str,0,pattern,0);

    }
    boolean dp(char[] str,int i,char[] pattern,int j){
        //base case
        if(j==pattern.length) return i==str.length;
        if(i==str.length){
            //如果能匹配空串，字符和*成对出现
            if((pattern.length-j)%2==1) return false;
            //检查是否是x*y*z*这种格式
            for(;j+1<pattern.length;j+=2){
                if(pattern[j+1]!='*') return false;
            }
            return true;
        }

            String key=i+","+j;
        if(memo.containsKey(key)) return memo.get(key);

        boolean res;
        if(str[i]==pattern[j] || pattern[j]=='.'){
            if(j<pattern.length-1 && pattern[j+1]=='*') res= dp(str,i,pattern,j+2) || dp(str,i+1,pattern,j);
            else res= dp(str,i+1,pattern,j+1);
        }
        else {
            if(j<pattern.length-1 && pattern[j+1]=='*') return dp(str,i,pattern,j+2);
            else res= false;
        }
        memo.put(key,res);
        return res;
    }
}

