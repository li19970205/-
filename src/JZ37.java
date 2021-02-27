//数字在排序数组中出现的次数
public class JZ37 {

    public int GetNumberOfK(int [] array , int k) {
        if (array.length==0) return 0;
        int index=search(array,k);
        if (index==-1) return 0;
        int count=0;
       for(int i=index;i<array.length;i++){
           if (array[i]==k) count++;
       }
       return count;
    }
    //寻找左侧边界的二分查找
    int search(int[] array,int k){
        int left=0,right=array.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(array[mid]==k) right=mid-1;

            else if(array[mid]>k) right=mid-1;
            else if(array[mid]<k) left=mid+1;
        }
        //越界，找不到目标值
        if(left>=array.length || array[left]!=k) return -1;
        return left;
    }
}