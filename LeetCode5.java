
//动态规划，字符串
public class LeetCode5 {
    public static void main(String[] args) {
        LeetCode5 lc5 = new LeetCode5();
        String s1 = "babad";
        String s2 = lc5.longestPalindrome(s1);
        System.out.println(s2);
        System.out.println(s1);
    }

    //暴力算法
/*    public String longestPalindrome(String s) {
        String ans="";
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
              String test=s.substring(i,j);
              if(isPalindrome(test)&&test.length()>max){
                  ans=s.substring(i,j);
                  max=Math.max(max,ans.length());
              }
            }
        }
        return ans;
    }

    public boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }*/

    //中心扩散法
    public String longestPalindrome(String s) {
/*      if(s==null||s.length()==0)
          return "";

      int strlen=s.length();
      int left=0;
      int right=0;
      int len=1;
      int maxStart=0;
      int maxLen=0;

        for (int i = 0; i < strlen; i++) {
            left=i-1;
            right=i+1;
            while (left>=0&&s.charAt(left)==s.charAt(i)){
                len++;
                left--;
            }
            while (right < strlen && s.charAt(right) == s.charAt(i)) {
                len++;
                right--;
            }
            while(left>=0&&right<strlen&&s.charAt(right)==s.charAt(left)){
                len+=2;
                left--;
                right++;
            }
            if(len>maxLen){
                maxLen=len;
                maxStart=left;
            }
            len=1;
        }
        return s.substring(maxStart+1,maxStart+maxLen+1);
    */


        int left = 0;
        int right = 0;
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            left--;
            right++;
            while (maxLen < right - left + 1) {
                if (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    start = left;
                    maxLen = right - left + 1;
                }
            }
        }

        return s.substring(start, start+maxLen+1);
    }
}
