package cool.jancy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : FindDifference
 * @description: TODO
 * @date 2024/4/30 上午10:36
 */
public class FindDifference {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>(2);
        List<Integer> list1 = new ArrayList<>(nums1.length);
        List<Integer> list2 = new ArrayList<>(nums2.length);
        a:
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    continue a;
                }
            }
            if (!list1.contains(nums1[i])) {
                list1.add(nums1[i]);
            }

        }
        res.add(list1);
        b:
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    continue b;
                }
            }
            if (!list2.contains(nums2[i])) {
                list2.add(nums2[i]);
            }

        }
        res.add(list2);
        return res;
    }

    public static void main(String[] args) {

    }
}
