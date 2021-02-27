import java.util.HashMap;

//题目：第一个只出现一次的字符
public class JZ34 {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        int result=-1;
        for (int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        //遍历哈希表
        for(int i=0;i<str.length();i++) {
            if (map.get(str.charAt(i)) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }
}