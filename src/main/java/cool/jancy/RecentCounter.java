package cool.jancy;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : RecentCounter
 * @description: TODO
 * @date 2024/5/7 上午10:14
 */
class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
