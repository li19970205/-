import java.util.ArrayList;
import java.util.HashMap;

//数组中只出现一次的数字
 public class JZ40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<array.length;i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            if(map.get(array[i])==1) list.add(array[i]);
        }
        num1[0]=list.get(0);
        num2[0]=list.get(1);
    }
}