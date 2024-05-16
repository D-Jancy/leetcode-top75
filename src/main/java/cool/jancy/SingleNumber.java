package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : SingleNumber
 * @description: TODO
 * @date 2024/5/16 上午11:04
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
