//丑数
public class JZ33 {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int[] result=new int[index];
        int a=0,b=0,c=0;
        result[0]=1;
      for (int i=1;i<index;i++){
          result[i]=Math.min(result[a]*2,Math.min(result[b]*3,result[c]*5));
          if (result[i]==result[a]*2) a++;
          if(result[i]==result[b]*3) b++;
          if(result[i]==result[c]*5) c++;
      }
      return result[index-1];
    }
}