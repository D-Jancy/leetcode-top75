package cool.jancy.sort;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Shell
 * @description: TODO
 * @date 2024/5/15 下午4:25
 */
public class Shell {

    public static void shellSort(int[] nums) {
        int n = nums.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int preIdx = i - gap;
                int curr = nums[i];
                while (preIdx >= 0 && curr < nums[preIdx]) {
                    nums[preIdx + gap] = nums[preIdx];
                    preIdx -= gap;
                }
                nums[preIdx + gap] = curr;
            }
            gap /= 2;
        }
    }
}
