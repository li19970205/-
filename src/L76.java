package debug;

import java.util.HashMap;

//题目描述：最小覆盖子串
//双指针，滑动窗口法
public class L76 {
    public String minWindow(String s, String t) {
        int left = 0, right = 0, start = 0;
        Long len = Long.MAX_VALUE;
        int valid = 0;// valid用来记录窗口中包含t中字符的个数
        HashMap<Character, Integer> need = new HashMap<Character, Integer>();
        HashMap<Character, Integer> windows = new HashMap<Character, Integer>();
        // 记录t中字符个数
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // 扩大右侧窗口
        while (right < s.length()) {
            char c = s.charAt(right);
            if (need.containsKey(c)) {
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                if (windows.get(c) == need.get(c))
                    valid++;
            }
            right++;
            // 收缩窗口
            while (valid == need.size()) {
                // 这里更新最短覆盖子串的长度
                if (right - left < len) {
                    start = left;
                    len = (Long) (right - left);
                }

                // 这里开始收缩窗口
                c = s.charAt(left);
                left++;
                if (need.containsKey(c)) {
                    if (windows.get(c) == need.get(c))
                        valid--;
                    windows.put(c, windows.get(c) - 1);
                }
            }
        }
        return len == Long.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    // public static void main(String[] args) {
    // L76 l = new L76();
    // String s = "a";
    // String t = "aa";
    // String result = l.minWindow(s, t);
    // System.out.print(result);
    // }
}