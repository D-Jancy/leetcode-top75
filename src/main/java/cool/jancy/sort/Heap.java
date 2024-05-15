package cool.jancy.sort;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Heap
 * @description: TODO
 * @date 2024/5/15 下午5:34
 */
public class Heap {
    static int heapLen;

    public static void heapSort(int[] nums) {
        heapLen = nums.length;
        buildMaxHeap(nums);
        for (int i = nums.length; i > 0; i--) {
            swap(nums, 0, i);
            heapLen--;
            maxHeapify(nums, 0);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            maxHeapify(nums, i);
        }
    }

    public static void maxHeapify(int[] nums, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (right < heapLen && nums[right] > nums[largest]) {
            largest = right;
        }
        if (left < heapLen && nums[left] > nums[largest]) {
            largest = left;
        }
        if (largest != i) {
            swap(nums, largest, i);
            maxHeapify(nums, largest);
        }
    }
}
