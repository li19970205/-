import java.util.HashMap;

//题目描述：无重复字符的最长子串
public class L3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int left = 0, right = 0, res = 0;
        HashMap<Character, Integer> windows = new HashMap<Character, Integer>();
        while (right < s.length()) {
            char c = s.charAt(right);
            windows.put(c, windows.getOrDefault(c, 0) + 1);
            right++;
            // 收缩窗口的条件
            while (windows.get(c) >= 2) {
                char d = s.charAt(left);
                windows.put(d, windows.get(d) - 1);
                left++;
            }
            res = Math.max(res, right - left);

        }
        return res;
    }

    public static void main(String[] args) {
        L3 l3 = new L3();
        String s = "pwwkew";
        int result = l3.lengthOfLongestSubstring(s);
        System.out.print(result);
    }
}