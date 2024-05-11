package cool.jancy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : OrangesRotting
 * @description: TODO
 * @date 2024/5/10 上午11:29
 */
public class OrangesRotting {


    public static int orangesRotting(int[][] grid) {
        int[][] OFFSET = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int res = 0;
        while (count > 0 && !q.isEmpty()) {
            res++;
            int size = q.size();
            while (size-- > 0) {
                int[] cur = q.poll();
                for (int[] offset : OFFSET) {
                    int x = cur[0] + offset[0];
                    int y = cur[1] + offset[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        count--;
                        q.offer(new int[]{x, y});
                    }
                }
            }
        }
        return count > 0 ? -1 : res;
    }


    public static void main(String[] args) {

    }
}
