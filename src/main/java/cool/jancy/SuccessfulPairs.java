package cool.jancy;

import java.util.Arrays;

/**
 * @author 12520
 * @version 1.0
 * @ClassName : SuccessfulPairs
 * @description: TODO
 * @date 2024/5/12 下午11:53
 */
public class SuccessfulPairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        int[] result = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0, right = m - 1;
            double cur = success * 1.0 / spell;
            while (left < right) { // 循环直至区间左右端点相同
                int mid = left + (right - left) / 2; // 防止计算时溢出
                if (potions[mid] >= cur) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (potions[right] * 1L * spell >= success) {
                result[i] = m - right;
            }
        }
        return result;
    }
}
