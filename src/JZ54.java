import java.util.ArrayList;
import java.util.HashMap;

//字符流中第一个不重复的字符
public class JZ54 {
    //Insert one char from stringstream
    ArrayList<Character> list=new ArrayList<Character>();
    public void Insert(char ch)
    {
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        for (int i=0;i<list.size();i++){
            if(map.get(list.get(i))==1) return list.get(i);
        }
        return '#';

    }
}