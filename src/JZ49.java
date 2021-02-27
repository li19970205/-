import java.util.ArrayList;

//把字符串转换成整数
public class JZ49 {
    public int StrToInt(String str) {
        if (str.length()==0) return 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        if ((str.charAt(0)!='+'|| str.charAt(0)!='-') & str.charAt(0)<10) list.add((int)str.charAt(0));
        for(int i=1;i<str.length();i++){
            if (str.charAt(i)>9) return 0;
            else if(str.charAt(i)<=9 & str.charAt(i)>=0)
            list.add((int)str.charAt(i));
        }
        int len=0;
        if (list.get(0)==0)  len=list.size()-1;
        else len=list.size();
        int count=0;
        for(int i=0;i<list.size();i++){
            count+=list.get(i)*Math.pow(10,len-1);
        }

        return count;
    }
}