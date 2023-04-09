//数组，双指针
public class LeetCode283 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        LeetCode283 lc283=new LeetCode283();
        lc283.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
/*    int[] nums2=new int[nums.length];
    int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums2[j]=nums[i];
                j++;
            }
        }
        for (int i = nums2.length; i < nums.length; i++) {
            nums2[i]=0;
        }
*//*        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }*//*
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums2[i];
        }*/

        if(nums==null) return;
        int p=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                int temp=nums[p];
              nums[p]=nums[i];
              nums[i]=temp;
              p++;
            }
        }
    }
}

