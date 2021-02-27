//数组中的逆序对
public class JZ35 {
    public int InversePairs(int [] array) {
        if(array.length==0) return 0;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    count++;
            }
        }
        System.out.print(count);
        return count%1000000007;
    }

    public static void main(String[] args){
        JZ35 jz35 = new JZ35();
        int array=
        result=jz35.InversePairs()
    }
}