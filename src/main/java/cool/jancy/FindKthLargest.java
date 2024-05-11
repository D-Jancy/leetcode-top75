package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : FindKthLargest
 * @description: TODO
 * @date 2024/5/10 下午4:49
 */
public class FindKthLargest {

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        buildMaxHeap(nums, n);
        for (int i = nums.length - 1; i >= nums.length - k + 1; i--) {
            swap(nums, 0, i);
            n--;
            maxHeapify(nums, 0, n);
        }
        return nums[0];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void buildMaxHeap(int[] arr, int heapSize) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, heapSize);
        }
    }

    public static void maxHeapify(int[] arr, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, largest, i);
            maxHeapify(arr, largest, heapSize);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(nums, 2));
    }
}
