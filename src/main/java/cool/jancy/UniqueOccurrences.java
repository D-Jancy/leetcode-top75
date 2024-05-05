package cool.jancy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : UniqueOccurrences
 * @description: TODO
 * @date 2024/4/30 上午10:50
 */
public class UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            set.add(entry.getKey());
        }
        if (set.size() != map.size()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {


    }
}
