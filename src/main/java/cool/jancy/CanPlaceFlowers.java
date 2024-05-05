package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : CanPlaceFlowers
 * @description: TODO
 * @date 2023/12/7 20:16
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            if (flowerbed.length == 1 && flowerbed[0] == 0) {
                return true;
            }
        } else {
            if (n == flowerbed.length) {
                return false;
            }
        }
        int i = 0;
        int j = 0;
        int k = 0;
        boolean flag = true;
        while (j < flowerbed.length) {
            if (flowerbed[j] == 1) {
                flag = false;
                j++;
                if (k == flowerbed.length - 1) {
                    i += k / 2;
                } else {
                    i += (k - 1) / 2;
                }
                if (i >= n) {
                    return true;
                }
                k = 0;
                continue;
            } else {
                k++;
            }
            if (j == flowerbed.length - 1 && k != 0) {
                if (flag) {
                    i += (k + 1) / 2;
                } else {
                    i += k / 2;
                }
            }
            j++;
        }

        //if (flowerbed[0] == 0 && flowerbed[1] == 0 && (n == 1 || flowerbed[2] == 1)) {
        //    i++;
        //}

        return i >= n;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0, 0}, 1));
    }
}
