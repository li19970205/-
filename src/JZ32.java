import java.util.Arrays;

//把数组排成最小的数（JZ32)
public class JZ32 {
    public String PrintMinNumber(int [] numbers) {
        if (numbers.length==0) return "";
        String[] nums=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            nums[i]=numbers[i]+"";
        }
//默认为降序
        Arrays.sort(nums,(s1,s2)->(s1+s2).compareTo(s2+s1));
        String result="";
        for(int i=0;i<nums.length;i++){
            result=result+nums[i];
        }
        return result;

    }
}