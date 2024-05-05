package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : MoveZeroes
 * @description: TODO
 * @date 2023/12/15 20:33
 */
public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {

        if (nums == null) {
            return nums;
        }

        //该指针标记交换次数，用于保持原来非0的顺序
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        for (int i : moveZeroes(new int[]{0, 1, 0, 3, 12})) {
            System.out.println(i);
        }
    }

}
