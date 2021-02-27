//整数中1的个数（JZ31）
public class JZ31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;){
                if(j%10==1) count++;
                j=j/10;

            }
        }
        return count;
    }
}