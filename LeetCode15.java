import java.util.*;

//数组，双指针，排序
public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums2={-1,0,1,2,-1,-4};
        int[] nums={0,0,0};
        LeetCode15 lc15=new LeetCode15();
        List<List<Integer>> lists = lc15.threeSum(nums);
        System.out.println(lists);

    }


    public List<List<Integer>> threeSum(int[] nums) {
        //定义一个集合
        List<List<Integer>> list=new ArrayList<>();
        //排序
        Arrays.sort(nums);

        if(nums.length<3||nums==null) return list;
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            //如果数组下标i的元素开始大于0，则升序数组中三个大于0的数必大于0
            if(nums[i]>0) break;
            //定义双指针
            int left=i+1;
            int right= nums.length-1;
            //去重
            if (i>0&&nums[i]==nums[i-1]) continue;

            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    //
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //
                    while (left<right&&nums[left]==nums[left+1]) left++;
                    //
                    while(left<right&&nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum>0) right--;
                else left++;
            }
        }
        return list;
        }

}
