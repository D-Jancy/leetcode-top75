package cool.jancy;

import java.util.*;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : CloseStrings
 * @description: TODO
 * @date 2024/4/30 上午11:07
 */
public class CloseStrings {
    public static boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap();
        Map<Character, Integer> map2 = new HashMap();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < word1.length(); i++) {
            set1.add(word1.charAt(i));
            if (map1.containsKey(word1.charAt(i))) {
                map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
            } else {
                map1.put(word1.charAt(i), 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            set2.add(word2.charAt(i));
            if (map2.containsKey(word2.charAt(i))) {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            } else {
                map2.put(word2.charAt(i), 1);
            }
        }
        if (!set1.equals(set2)) {
            return false;
        }

        if (map1.size() != map2.size()) {
            return false;
        } else {
            List<Integer> list1 = new ArrayList(map1.size());
            List<Integer> list2 = new ArrayList(map1.size());
            map1.forEach((k, v) -> {
                list1.add(v);
            });
            map2.forEach((k, v) -> {
                list2.add(v);
            });
            return areListsEqual(list1, list2);
        }

    }

    public static boolean areListsEqual(List<Integer> list1, List<Integer> list2) {
        // 如果列表长度不同，则它们肯定不相等
        if (list1.size() != list2.size()) {
            return false;
        }

        // 对两个列表进行排序
        Collections.sort(list1);
        Collections.sort(list2);

        // 逐个比较对应位置的元素
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));
    }
}
