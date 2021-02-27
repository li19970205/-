import java.util.ArrayList;
import java.util.Arrays;

//扑克牌顺子
public class JZ45 {
    public boolean IsContinuous(int [] numbers) {
        if(numbers.length==0) return false;
        //先对数组元素排序
        Arrays.sort(numbers);
        int count=0;  //记录0的个数
        int sum=0;
        for (int i=0;i<numbers.length-1;i++){
            if(numbers[i]==0) count++;
         else{
             //如果相邻两数相等，则直接返回false
             if(numbers[i+1]==numbers[i]) return false;
             //如果相邻两数差>1,则不连续，如果差为2则需要一个0，sum记录最终需要的0的个数
             else if((numbers[i+1]-numbers[i])>1) sum+=numbers[i+1]-numbers[i]-1;  //sum表示需要0的个数
            }
        }
        return count>=sum?true:false;

    }
}