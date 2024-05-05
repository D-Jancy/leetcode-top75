package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : FindMaxAverage
 * @description: TODO
 * @date 2024/4/11 下午5:39
 */
public class FindMaxAverage {

    public static double findMaxAverage(int[] nums, int k) {
        int x = 0;
        double max = 0;
        int a = nums.length - k;
        if (a <= 0) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return (double) sum / k;
        } else {
            for (int j = 0; j < a; j++) {
                for (int i = 0; i <= k; i++) {
                    x += nums[j + i];
                }
                System.out.println(x);
                double y = (double) x / k;
                if (y > max) {
                    max = y;
                }
                x = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1, 3, 3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
