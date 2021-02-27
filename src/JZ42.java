import java.util.ArrayList;

//和为S的两个数字

//解法：利用双指针中的左右指针
public class JZ42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int cheng=Integer.MAX_VALUE;
        int num1=-1,num2=-1;
        if(array.length<2) return result;
        int left=0,right=array.length-1;
       while (left<right){
           if((array[left]+array[right])==sum) {
               if(array[left]*array[right]<cheng){
                   cheng=array[left]*array[right];
                   num1=left;
                   num2=right;
               }
               left++;
               right--;
           }
           else if((array[left]+array[right])>sum)  right--;

           else  if ((array[left]+array[right])<sum) left++;
       }
       if(num1!=num2) {
           result.add(array[num1]);
           result.add(array[num2]);
       }

       return result;

    }
}