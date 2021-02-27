import java.util.HashMap;

//数组中重复的数字
public class JZ50 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length==0){
            duplication[0]=-1;
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<length;i++){
            map.put(numbers[i],map.getOrDefault(numbers[i],0)+1);
            if(map.get(numbers[i])>1) {
                duplication[0]=numbers[i];
                return true;
            }
        }
        duplication[0]=-1;
        return false;

    }
    public static void main(String[] args){
        JZ50 jz50=new JZ50();
        int[] numbers=new int[]{};
        int length=numbers.length;
        int[] duplication=new int[1];
        boolean result=jz50.duplicate(numbers,length,duplication);
        System.out.print(result);

    }
}