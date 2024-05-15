package cool.jancy.sort;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Quick
 * @description: TODO
 * @date 2024/5/15 下午5:12
 */
public class Quick {

    //low第一次为0，high为n-1
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int position = partition(nums, low, high);
            quickSort(nums, low, position - 1);
            quickSort(nums, position + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int pointer = low;
        for (int i = low; i < high; i++) {
            if (nums[i] <= pivot) {
                int tmp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = tmp;
                pointer++;
            }
        }
        int tmp = nums[pointer];
        nums[pointer] = nums[high];
        nums[high] = tmp;
        return pointer;
    }
}
