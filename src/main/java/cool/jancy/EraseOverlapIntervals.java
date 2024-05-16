package cool.jancy;

import java.util.Arrays;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : EraseOverlapIntervals
 * @description: TODO
 * @date 2024/5/16 下午5:33
 */
public class EraseOverlapIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= right) {
                ans++;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }

}
