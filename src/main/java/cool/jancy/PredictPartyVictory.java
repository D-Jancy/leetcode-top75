package cool.jancy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : PredictPartyVictory
 * @description: TODO
 * @date 2024/5/7 上午10:35
 */
public class PredictPartyVictory {
    public static String predictPartyVictory(String senate) {
        Deque<Integer> rd = new ArrayDeque<>(), dd = new ArrayDeque<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rd.addLast(i);
            } else {
                dd.addLast(i);
            }
        }
        while (!rd.isEmpty() && !dd.isEmpty()) {
            int a = rd.remove(), b = dd.remove();
            if (a < b) {
                rd.addLast(a + n);
            } else {
                dd.addLast(b + n);
            }
        }
        return !rd.isEmpty() ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }
}
