import java.util.ArrayList;

//翻转单词顺序列
public class JZ44 {
    public String ReverseSentence(String str) {
       String[] list=str.split(" "); //将字符串以空格划分
        if(list.length==0) return str;
        //反向遍历数组
        String result=list[list.length-1];
        for(int i=list.length-2;i>=0;i--){
            result=result+" "+list[i];
        }
        return result;
    }
}