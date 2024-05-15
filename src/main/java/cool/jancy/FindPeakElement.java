package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : FindPeakElement
 * @description: TODO
 * @date 2024/5/13 上午9:58
 */
public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }


}
