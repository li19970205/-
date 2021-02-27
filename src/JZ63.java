
import java.util.PriorityQueue;

//数据流中的中位数
//利用大根堆存储较小的数，小根堆存储较大的数
public class JZ63 {
    PriorityQueue<Integer> small_stack=new PriorityQueue<Integer>();  //存较大的数
    PriorityQueue<Integer> big_stack=new PriorityQueue<Integer>((x,y)->(y-x));  //存较小的数
    public void Insert(Integer num) {
        if(small_stack.size()!=big_stack.size()){
            small_stack.offer(num);
            big_stack.offer(small_stack.poll());
        }
        else{
            big_stack.offer(num);
            small_stack.offer(big_stack.poll());
        }

    }

    public Double GetMedian() {
        if (small_stack.size()==big_stack.size()) return small_stack.peek()/2.0+big_stack.peek()/2.0;
        else return small_stack.peek()/1.0;
    }


}