import java.util.Arrays;

//构建乘积数组
public class JZ51 {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        Arrays.fill(B,1);
        for(int i=1;i<A.length;i++) B[i]=B[i-1]*A[i-1];//这里B[i-1]
        int tem=1;
        for(int j=A.length-2;j>=0;j--){
            tem*=A[j+1];
            B[j]*=tem;
        }
        return B;
    }
}