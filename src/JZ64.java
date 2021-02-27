import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//滑动窗口的最大值
//利用大根堆存储窗口元素
public class JZ64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(num.length==0 || num.length<size || size<=0) return list;
        PriorityQueue<Integer> stack=new PriorityQueue<Integer>((x,y)->(y-x));
        //将第一个滑动窗口元素加入到大根堆中
        for(int i=0;i<size;i++) stack.offer(num[i]);
        int i=0;
        while ((i+size)<=num.length){
            list.add(stack.peek());
            stack.remove(i);
            i++;
            if((i+size-1)<num.length) stack.offer(num[i+size-1]);
        }
        return list;
    }
}