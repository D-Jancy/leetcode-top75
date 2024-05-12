package cool.jancy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author 12520
 * @version 1.0
 * @ClassName : MaxScore
 * @description: TODO
 * @date 2024/5/12 下午4:49
 */
public class MaxScore {

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums2.length;

        //构造nums2下标
        Integer[] idxs = new Integer[n];
        for (int i = 0; i < n; i++) {
            idxs[i] = i;
        }
        //根据nums2值降序排序nums2的下标
        Arrays.sort(idxs, (i, j) -> nums2[j] - nums2[i]);

        //构造nums1小根堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0, maxScore = 0;
        for (Integer idx : idxs) {
            int x = nums1[idx];
            int y = nums2[idx];
            minHeap.offer(x);
            //将K个子序列放入小根堆。同时滚动nums1，移除子序列中的额最小值，即小根堆的顶端值。以此维护nums1中当前nums2下标下的K个子序列的局部最大值
            //贪心思想
            sum += (minHeap.size() <= k) ? x : (x - minHeap.poll());
            //维护外部最大值
            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * y);
            }
        }
        return maxScore;
    }
}
