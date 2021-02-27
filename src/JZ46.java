import java.util.LinkedList;
import java.util.Queue;

//孩子们的游戏
public class JZ46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0 || m==1) return -1;
        Queue<Integer> queue=new LinkedList<Integer>();
        for(int i=0;i<n;i++) queue.offer(i);
        while(queue.size()>1){
            for(int i=0;i<m-1;i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.size()==1?queue.poll():-1;
    }
}