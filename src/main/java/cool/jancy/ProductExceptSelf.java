package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : ProductExceptSelf
 * @description: TODO
 * @date 2023/12/13 20:19
 */
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int total = 1;

        int x = -1;
        boolean flag = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (x != -1) {
                    flag = false;
                }
                x = i;
            } else {
                total = nums[i] * total;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (x != -1) {
                if (x != j) {
                    nums[j] = 0;
                } else {
                    if (flag) {
                        nums[j] = total;
                    } else {
                        nums[j] = 0;
                    }
                }
            } else {
                //int quotient = 0;
                //int remaining = total;
                //
                //// 模拟除法转换为减法
                //while (remaining >= nums[j]) {
                //    remaining -= nums[j];
                //    quotient++;
                //}
                //nums[j] = quotient;
                nums[j] = total / nums[j];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{-1, 1});
        for (int i : ints) {
            System.out.println(i);
        }

    }
}
