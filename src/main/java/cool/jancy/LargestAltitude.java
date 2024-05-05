package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : LargestAltitude
 * @description: TODO
 * @date 2024/4/29 上午10:46
 */
public class LargestAltitude {
    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = gain[0];
        int x = 0;
        for (int i = 1; i < n; i++) {
            x += gain[i - 1];
            max = Math.max(max, gain[i] + x);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(nums));
    }
}
