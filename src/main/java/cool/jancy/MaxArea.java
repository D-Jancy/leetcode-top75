package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : MaxArea
 * @description: TODO
 * @date 2023/12/20 19:50
 */
public class MaxArea {

    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
