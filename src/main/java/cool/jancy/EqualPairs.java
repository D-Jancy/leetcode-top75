package cool.jancy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : EqualPairs
 * @description: TODO
 * @date 2024/5/6 上午10:08
 */
public class EqualPairs {

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> cnt = new HashMap<List<Integer>, Integer>();
        for (int[] row : grid) {
            List<Integer> arr = new ArrayList<Integer>();
            for (int num : row) {
                arr.add(num);
            }
            cnt.put(arr, cnt.getOrDefault(arr, 0) + 1);
        }

        int res = 0;
        for (int j = 0; j < n; j++) {
            List<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(grid[i][j]);
            }
            if (cnt.containsKey(arr)) {
                res += cnt.get(arr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
    }
}
