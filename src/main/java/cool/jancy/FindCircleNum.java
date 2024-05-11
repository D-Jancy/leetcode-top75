package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : FindCircleNum
 * @description: TODO
 * @date 2024/5/9 上午11:03
 */
public class FindCircleNum {

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(isConnected, vis, n, i);
                res++;
            }
        }
        return res;
    }

    public static void dfs(int[][] isConnected, boolean[] vis, int n, int i) {
        for (int j = 0; j < n; j++) {
            if (!vis[j] && isConnected[i][j] == 1) {
                vis[j] = true;
                dfs(isConnected, vis, n, j);
            }
        }
    }

    public static void main(String[] args) {

    }
}
