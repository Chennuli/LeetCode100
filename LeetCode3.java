import java.util.HashMap;

//字符串，哈希表，滑动窗口
public class LeetCode3 {
    public static void main(String[] args) {
        LeetCode3 lc3 = new LeetCode3();
        String str = new String("pwwkew");
        int length = lc3.lengthOfLongestSubstring(str);
        System.out.println(length);
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxlen = 0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            if (hm.containsKey(s.charAt(end))) {
                start = Math.max(start, hm.get(s.charAt(end)));
            }
            maxlen = Math.max(maxlen, end - start + 1);
            hm.put(s.charAt(end), end + 1);
        }
        return maxlen;
    }
}


