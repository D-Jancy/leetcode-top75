package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : CountBits
 * @description: TODO
 * @date 2024/5/16 上午10:26
 */
public class CountBits {

    public int[] countBits(int n) {
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if ((i & 1) == 0) {
                nums[i] = nums[i >> 1];
            } else {
                nums[i] = nums[i - 1] + 1;
            }
        }
        return nums;
    }
}
