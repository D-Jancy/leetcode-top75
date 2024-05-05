package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : PivotIndex
 * @description: TODO
 * @date 2024/4/29 上午11:26
 */
public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] sumsL = new int[n];
        int[] sumsR = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sumsL[i] = 0;
            } else {
                sumsL[i] = nums[i - 1] + sumsL[i - 1];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                sumsR[i] = 0;
            } else {
                sumsR[i] = nums[i + 1] + sumsR[i + 1];
            }
        }
        int x = -1;
        for (int i = 0; i < n; i++) {
            if (sumsL[i] == sumsR[i]) {
                x = i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
