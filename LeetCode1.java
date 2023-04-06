import java.util.HashMap;

//哈希表，数组
public class LeetCode1 {
    public static void main(String[] args) {
        LeetCode1 lc1 = new LeetCode1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] nums2 = lc1.twoSum(nums, target);
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
/*        int[] arr = new int[2];
        int l,r;
        for ( l = 0; l < nums.length; l++) {
            for ( r = l + 1; r < nums.length; r++) {
                if (nums[l] + nums[r] == target) {
                  arr = new int[]{l, r};
                }
            }
        }
        return arr;*/

        HashMap<Integer,Integer> hash=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hash.containsKey(target-nums[i])){
                return new int[]{hash.get(target-nums[i]),i};
            }
            else hash.put(nums[i],i);
        }
        return new int[0];
    }


}
