package cool.jancy.sort;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : select
 * @description: TODO
 * @date 2024/5/15 上午11:38
 */
public class Selection {

    public static void selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int tmp = nums[i];
                nums[i] = nums[minIdx];
                nums[minIdx] = tmp;
            }
        }
    }
}
