//前N项和
public class JZ47 {
    public int Sum_Solution(int n) {
        boolean flag=n>0 &&(n+=Sum_Solution(n-1))>0 ;
        return n;

    }
}