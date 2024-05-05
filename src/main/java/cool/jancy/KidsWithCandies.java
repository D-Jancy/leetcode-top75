package cool.jancy;

import java.util.Arrays;
import java.util.List;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : KidsWithCandies
 * @description: TODO
 * @date 2023/12/6 20:16
 */
public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        Boolean[] flags = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i] + extraCandies) {
                flags[i] = true;
            } else {
                flags[i] = false;
            }
        }

        return Arrays.asList(flags);
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{4, 1, 4, 8, 9, 6, 4}, 1));
    }
}
