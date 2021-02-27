import java.util.ArrayList;
import java.util.PriorityQueue;

//题目描述：最小的k个数
public class JZ29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        //利用优先队列生成大根堆
       PriorityQueue<Integer> queue=new PriorityQueue<Integer>((x,y)->(y-x));
        if (k == 0 || k>input.length) return result;
        //向大根堆中存入K个数
        for (int i=0;i<k;i++) queue.offer(input[i]);

        for(int j=k;j<input.length;j++) {
            if (queue.peek()>input[j]) {
                queue.poll();
                queue.offer(input[j]);
            }
        }

        //将堆中的元素存入数组中
        for(int i=0;i<k;i++) result.add(queue.poll());
        return result;
    }
}