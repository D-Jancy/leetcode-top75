package cool.jancy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : CombinationSum3
 * @description: TODO
 * @date 2024/5/13 上午11:50
 */
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), k, 1, n);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> list, int k, int start, int n) {
        //终止条件，如果满足这个条件，再往下找也没什么意义了
        if (list.size() == k || n <= 0) {
            //如果找到一组合适的就把他加入到集合list中
            if (list.size() == k && n == 0) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            //选择当前值
            list.add(i);
            //递归
            dfs(res, list, k, i + 1, n - i);
            //撤销选择
            list.remove(list.size() - 1);
        }
    }
}
