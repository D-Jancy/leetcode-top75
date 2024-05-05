package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : ReverseWords
 * @description: TODO
 * @date 2023/12/12 20:04
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        int left = 0, right = s.length() - 1;

        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        // 使用双指针
        int m = right;
        StringBuilder res = new StringBuilder();
        // 除去尾部空格
        int n = m; // n是另一个指针
        while (m >= left) {
            while (m >= 0 && s.charAt(m) != ' ') {
                --m;
            }
            res.append(s.substring(m + 1, n - m)).append(" "); // 获取单词并加上空格
            while (m >= 0 && s.charAt(m) == ' ') {
                --m;
            }
            n = m;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
