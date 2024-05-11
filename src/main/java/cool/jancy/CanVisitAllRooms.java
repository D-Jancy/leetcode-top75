package cool.jancy;

import java.util.List;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : CanVisitAllRooms
 * @description: TODO
 * @date 2024/5/9 上午10:30
 */
public class CanVisitAllRooms {

    boolean[] vis;
    int num;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        vis = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public void dfs(List<List<Integer>> rooms, int x) {
        vis[x] = true;
        num++;
        for (int it : rooms.get(x)) {
            if (!vis[it]) {
                dfs(rooms, it);
            }
        }
    }

    public static void main(String[] args) {

    }
}
