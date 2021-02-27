//不用加减乘除做加法
public class JZ48 {
    public int Add(int num1,int num2) {
        //分为两部分，即进位运算+无进位运算
        //当进位为0时，也就是说没有进位运算时，直接返回无进位运算的结果
        while (num2!=0){
            //进位运算，与运算
           int c=(num1 & num2)<<1;//需要左移一位
            //无进位运算
            num1=num1^num2;
            num2=c;
        }
        return num1;

    }
}