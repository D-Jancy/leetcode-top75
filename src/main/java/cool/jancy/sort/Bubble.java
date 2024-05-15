package cool.jancy.sort;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Bubble
 * @description: TODO
 * @date 2024/5/15 上午11:40
 */
public class Bubble {

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
