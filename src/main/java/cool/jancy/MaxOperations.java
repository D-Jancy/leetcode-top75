package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : MaxOperations
 * @description: TODO
 * @date 2024/4/11 下午2:27
 */
public class MaxOperations {

    public static int maxOperations(int[] nums, int k) {
        int i = 0, j = nums.length - 1, x = nums.length - 1;
        int result = 0;
        while (i <= nums.length / 2) {
            if (nums[i] + nums[j] == k) {
                result++;
                i = i + 1;
                x = j;
            }
            if (i > j) {
                i++;
                j = x;
            }
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 2, 3, 1, 1, 4, 1};
        System.out.println(maxOperations(nums, 4));
    }
}
