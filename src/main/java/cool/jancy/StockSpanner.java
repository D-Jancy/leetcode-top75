package cool.jancy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : StockSpanner
 * @description: TODO
 * @date 2024/5/16 下午5:57
 */
class StockSpanner {
    Deque<int[]> stack = new ArrayDeque<>();
    int cur = 0;

    public StockSpanner() {
    }

    public int next(int price) {
        while (!stack.isEmpty() && stack.peek()[1] <= price) {
            stack.pop();
        }
        int prev = stack.isEmpty() ? -1 : stack.peek()[0], ans = cur - prev;
        stack.push(new int[]{cur++, price});
        return ans;
    }
}
