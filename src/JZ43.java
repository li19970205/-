import java.util.LinkedList;
import java.util.Queue;

//左旋转字符串
public class JZ43 {
    public String LeftRotateString(String str,int n) {
        String result="";
        if (str.length()<=1) return str;
        Queue<Character> queue=new LinkedList<>();
        //将字符串存入到队列中
        for(int i=0;i<str.length();i++){
            queue.offer(str.charAt(i));
        }

        //左移，即将队头元素插入到队尾
        for(int i=0;i<n;i++){
            queue.offer(queue.poll());
        }

        //取出队列中所有的元素
        while(queue.size()>0)
            result+=queue.poll();

        return result;

    }

    public static void main(String[] args){
        JZ43 jz43=new JZ43();
        String str="abcXYZdef";
        int n=3;
        String result=jz43.LeftRotateString(str,n);
        System.out.print(result);
    }
}