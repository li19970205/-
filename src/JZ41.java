import java.util.ArrayList;

//和为S的连续正数序列
public class JZ41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int left=0,right=0;
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        int[] array=new int[sum];
        for(int i=0;i<array.length;i++) array[i]=i+1;
        int count=0;
        //滑动窗口
        while (right<array.length){
            count=count+array[right];
            if (count==sum & (right-left)>0) {
                ArrayList<Integer> shu=new ArrayList<>();
                for (int i=left;i<=right;i++) shu.add(array[i]);
                result.add(shu);
            }

            //收缩窗口
            while(count>sum) {
                count = count - array[left];
                left++;
                if (count == sum &(right-left)>0) {
                    ArrayList<Integer> shu = new ArrayList<>();
                    for (int i = left; i <= right; i++) shu.add(array[i]);
                    result.add(shu);
                }
            }
                right++;

            }
        return result;
        }

    }
