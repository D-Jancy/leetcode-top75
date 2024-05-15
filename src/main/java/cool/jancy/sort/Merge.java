package cool.jancy.sort;

import java.util.Arrays;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Merge
 * @description: TODO
 * @date 2024/5/15 下午4:39
 */
public class Merge {
    public static int[] mergeSort(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return nums;
        }
        int[] nums1 = Arrays.copyOfRange(nums, 0, n / 2);
        int[] nums2 = Arrays.copyOfRange(nums, n / 2, n);
        return merge(mergeSort(nums1), mergeSort(nums2));
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] sortNums = new int[m + n];
        int idx = 0, idx1 = 0, idx2 = 0;
        while (idx1 < m && idx2 < n) {
            if (nums2[idx2] < nums1[idx1]) {
                sortNums[idx] = nums2[idx2];
                idx2++;
            } else {
                sortNums[idx] = nums1[idx1];
                idx1++;
            }
            idx++;
        }
        if (idx1 < m) {
            while (idx1 < m) {
                sortNums[idx] = nums1[idx1];
                idx1++;
                idx++;
            }
        } else {
            while (idx2 < n) {
                sortNums[idx] = nums2[idx2];
                idx2++;
                idx++;
            }
        }
        return sortNums;
    }
}
