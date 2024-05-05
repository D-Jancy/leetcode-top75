package cool.jancy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : MaxVowels
 * @description: TODO
 * @date 2024/4/12 下午4:05
 */
public class MaxVowels {

    public static int maxVowels(String s, int k) {
        int result = 0;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                integers.add(i);
                result++;
            }
        }
        int max = result;
        for (int i = k; i < s.length(); i++) {
            if (integers.contains(i - k)) {
                max--;
                integers.remove(integers.indexOf(i - k));
            }
            if (isVowel(s.charAt(i))) {
                integers.add(i);
                max++;
            }
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(maxVowels(s, 3));
    }
}
