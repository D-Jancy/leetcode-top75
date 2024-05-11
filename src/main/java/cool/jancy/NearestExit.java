package cool.jancy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : NearestExit
 * @description: TODO
 * @date 2024/5/10 上午10:47
 */
public class NearestExit {

    private static final int[][] OFFSET = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static final char BLANK = '.';
    private static final char WALL = '*';

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        maze[entrance[0]][entrance[1]] = WALL;
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] pos = queue.poll();
                int i = pos[0], j = pos[1];
                if (notEntrance(entrance, i, j) && isExit(i, m, j, n)) {
                    return depth;
                }
                for (int[] offset : OFFSET) {
                    int x = i + offset[0];
                    int y = j + offset[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == BLANK) {
                        queue.add(new int[]{x, y});
                        maze[x][y] = WALL;
                    }
                }
            }
            depth++;
        }
        return -1;
    }

    private boolean isExit(int i, int m, int j, int n) {
        return i - 1 < 0 || i + 1 >= m || j - 1 < 0 || j + 1 >= n;
    }

    private boolean notEntrance(int[] entrance, int i, int j) {
        return i != entrance[0] || j != entrance[1];
    }

    public static void main(String[] args) {

    }
}

