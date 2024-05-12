package cool.jancy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 12520
 * @version 1.0
 * @ClassName : TotalCost
 * @description: TODO
 * @date 2024/5/12 下午11:18
 */
public class TotalCost {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        long totalCost = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(n, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] != b[0] ? a[0] - b[0] : a[1] - b[1];
            }
        });
        int left = candidates - 1, right = n - candidates;
        if (left + 1 < right) {
            for (int i = 0; i <= left; i++) {
                pq.offer(new int[]{costs[i], i});
            }
            for (int i = right; i < n; i++) {
                pq.offer(new int[]{costs[i], i});
            }
        } else {
            for (int i = 0; i < n; i++) {
                pq.offer(new int[]{costs[i], i});
            }
        }
        for (int i = 0; i < k; i++) {
            int[] p = pq.poll();
            int cost = p[0], idx = p[1];
            totalCost += cost;
            if (left + 1 < right) {
                if (idx <= left) {
                    left++;
                    pq.offer(new int[]{costs[left], left});
                } else {
                    right--;
                    pq.offer(new int[]{costs[right], right});
                }
            }
        }
        return totalCost;
    }
}
