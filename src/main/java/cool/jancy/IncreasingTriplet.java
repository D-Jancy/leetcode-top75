package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : IncreasingTriplet
 * @description: TODO
 * @date 2023/12/14 20:20
 */
public class IncreasingTriplet {

    public static boolean increasingTriplet(int[] nums) {

        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int[] leftMin = new int[n];
        leftMin[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > leftMin[i - 1] && nums[i] < rightMax[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
    }
}
