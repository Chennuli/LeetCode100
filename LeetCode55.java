
//贪心，数组，动态规划
public class LeetCode55 {
    public static void main(String[] args) {
        LeetCode55 lc55=new LeetCode55();
        int[] arr={2,3,1,1,4};
        boolean b = lc55.canJump(arr);
        if(b){
            System.out.println("可以到最后一个下标");
        }
        else {
            System.out.println("不可以到最后一个下标");
        }
    }

    public boolean canJump(int[] nums) {
/*        boolean fg=false;
        if(nums[0]>= nums.length)
            fg=true;
        else if(nums[0]==0){
            fg=false;
        }
        else {

        }
        return fg;*/

        int rightmost=0;
        for (int i = 0; i < nums.length; i++) {    //  int[] arr={2,3,1,1,4};   nums = [3,2,1,0,4];
            if(i<=rightmost){
                rightmost=Math.max(rightmost,i+nums[i]);
            }
            if(rightmost>= nums.length-1)
                return true;

        }
        return false;
    }

}
