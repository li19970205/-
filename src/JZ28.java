import java.util.HashMap;

//数组中出现次数超过一半的数字（JZ28）

//用哈希表存储数组元素  时间复杂度和空间复杂度都是o(n)
public class JZ28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else map.put(array[i],1);
            if (map.get(array[i])>array.length/2) return array[i];

        }
        return 0;

    }
}


//解法二 时间复杂度为o(N) 空间复杂度为o(1)
class JZ2800 {
    public int MoreThanHalfNum_Solution(int [] array) {
      int x=0,votes=0,count=0;
      for(int num :array){
          if(votes==0) x=num;
          if(num==x) votes+=1;
          else votes+=-1;
      }
      //验证x是否为众数
        for (int num:array){
            if(num==x) count+=1;
        }
        return count>array.length/2?x:0;


    }
}