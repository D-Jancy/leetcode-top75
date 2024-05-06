package cool.jancy;

import java.util.LinkedList;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : DecodeString
 * @description: TODO
 * @date 2024/5/6 下午5:44
 */
public class DecodeString {

    public static String decodeString(String s) {
        int length = s.length();
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stackMulti = new LinkedList<>();
        LinkedList<String> stackRes = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '[') {
                stackMulti.addLast(multi);
                stackRes.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stackMulti.removeLast();
                for (int j = 0; j < cur_multi; j++) {
                    tmp.append(res);
                }
                res = new StringBuilder(stackRes.removeLast() + tmp);
            } else if (Character.isDigit(c)) {
                multi = multi * 10 + Integer.parseInt(c + "");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }


    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
}
