package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Tribonacci
 * @description: TODO
 * @date 2024/5/13 下午3:15
 */
public class Tribonacci {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;

    }

    public static void main(String[] args) {

    }
}
