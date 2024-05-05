package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : IsSubsequence
 * @description: TODO
 * @date 2023/12/19 19:38
 */
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        //Deque<Character> deque = new ArrayDeque<>();
        //for (int i = 0; i < s.length(); i++) {
        //    deque.offer(s.charAt(i));
        //}
        //for (int i = 0; i < t.length(); i++) {
        //    if (deque.peek() == t.charAt(i)) {
        //        deque.pop();
        //    }
        //    if (deque.isEmpty()) {
        //        return true;
        //    }
        //}
        //return false;

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
