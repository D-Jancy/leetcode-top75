package cool.jancy.sort;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Insertion
 * @description: TODO
 * @date 2024/5/15 下午4:05
 */
public class Insertion {

    public static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int preIdx = i - 1;
            int curr = nums[i];
            while (curr >= 0 && curr < nums[preIdx]) {
                nums[preIdx + 1] = nums[preIdx];
                preIdx--;
            }
            nums[preIdx + 1] = curr;
        }
    }
}
