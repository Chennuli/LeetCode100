
// 贪心算法（Greedy Algorithm，又称贪婪算法），指在对问题求解时，不从整体最优上加以考虑，而总是做出在当前看来是最好的选择。
// 数组，双指针
public class LeetCode11 {
    public static void main(String[] args) {
        LeetCode11 lc11=new LeetCode11();
        int[] arr={1,8,6,2,5,4,8,3,7};
        int maxArea = lc11.maxArea(arr);
        System.out.println(maxArea);

    }

    //暴力算法
/*    public int maxArea(int[] height) {
        int area=0;
        int maxArea=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
              if(height[i]>=height[j])
              {
                  area=(j-i)*height[j];
              }
              else{
                  area=(j-i)*height[i];
              }
              if(maxArea<=area){
                  maxArea=area;
              }
            }
        }
        return maxArea;
    }*/

    public int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int rigth=height.length-1;
        int area=0;
        while (left<rigth){
            if(height[left]<=height[rigth]){
                area=(rigth-left)*height[left];
                left++;
            }
            else{
                area=(rigth-left)*height[rigth];
                rigth--;
            }
            if(maxArea<=area)  maxArea=area;
        }
        return maxArea;
    }
}
