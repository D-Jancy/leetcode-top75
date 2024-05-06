package cool.jancy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : RemoveStars
 * @description: TODO
 * @date 2024/5/6 上午11:19
 */
public class RemoveStars {

    public static String removeStars(String s) {
        int length = s.length();
        Deque<Character> characters = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '*') {
                characters.pop();
            } else {
                characters.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!characters.isEmpty()) {
            sb.append(characters.pollLast());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
