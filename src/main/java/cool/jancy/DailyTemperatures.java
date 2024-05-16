package cool.jancy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : DailyTemperatures
 * @description: TODO
 * @date 2024/5/16 下午5:40
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            int current = temperatures[i];
            while (!stack.isEmpty() && temperatures[stack.peek()] < current) {
                int top = stack.pop();
                result[top] = i - top;
            }
            stack.push(i);
        }
        return result;
    }
}
