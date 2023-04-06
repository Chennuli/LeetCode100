import java.util.Arrays;

public class LeetCode4 {
    public static void main(String[] args) {
        LeetCode4 lc4 = new LeetCode4();
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{1};
        double median = lc4.findMedianSortedArrays(arr1, arr2);
        System.out.println(median);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int ans = 0; //result的元素个数
        int tag = 0; //存储i++后原有的j的值
        int j = 0;
        lo1:
        for (int i = 0; i < nums1.length; i++) {
            lo2:
            for (j = 0; j <= nums2.length; ) {
                j = tag;
                //当nums1中的元素大于nums2中的元素
                while ((nums1[i] >= nums2[j]) && nums1 != null && nums2 != null) {
                    System.arraycopy(nums2, j, result, ans, 1); //将nums2[j]复制到新的数组
                    ans++;//新的数组元素加1
                    j++;
                    //当nums2的元素全部复制到result，直接把剩下的nums1中的元素复制到result
                    while (j == nums2.length) {
                        System.arraycopy(nums1, i, result, ans, nums1.length - i);
                        ans = ans + nums1.length - 1;
                        break lo1;
                    }
                }
                //当nums1中的元素小于nums2中的元素，将nums1[i]复制到新的数组
                while ((nums1[i] < nums2[j]) && nums1 != null && nums2 != null) {
                    System.arraycopy(nums1, i, result, ans, 1);
                    ans++;
                    while (i == nums1.length-1 ) {
                        System.arraycopy(nums2, j, result, ans, nums1.length - j);
                        ans = ans + nums1.length - 1;
                        break lo1;
                    }
                    tag = j;//将当前比较的元素位置复制给tag，下轮循环直接从nums2[j(tag)]开始比较
                    break lo2;//当nums1中的元素小于nums2中的元素，直接跳出内循环
                }
                //当nums1 == null && nums2 != null时，直接将不为空的数组复制到result
                while (nums1.length == 0 && nums2.length != 0) {
                    System.arraycopy(nums2, 0, result, 0, nums2.length);
                    break lo1;
                }
                while (nums1.length != 0 && nums2.length == 0) {
                    System.arraycopy(nums1, 0, result, 0, nums1.length);
                    break lo1;
                }
            }
        }
        double med = 0;
        if (result.length % 2 != 0) {
            int q = result.length / 2;
            med = result[q];
        } else {
            int p = result.length / 2;
            med = (double) (result[p] + result[p - 1]) / 2;
        }
        return med;
    }
}
