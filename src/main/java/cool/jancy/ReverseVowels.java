package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : ReverseVowels
 * @description: TODO
 * @date 2023/12/11 20:01
 */
public class ReverseVowels {
    public static String reverseVowels(String s) {
        if (s.length() == 1) {
            return s;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] characters = new char[s.length()];
        boolean blankFlag = true;
        while (i != j) {
            if (!Character.isWhitespace(s.charAt(i)) || !Character.isWhitespace(s.charAt(j))) {
                blankFlag = false;
            }
            if (i >= s.length() || j < 0) {
                break;
            }
            if (s.charAt(i) == s.charAt(j)) {
                characters[i] = s.charAt(i);
                characters[j] = s.charAt(j);
                i++;
                j--;
            } else if (containsChar(s.charAt(i)) && containsChar(s.charAt(j))) {
                characters[j] = s.charAt(i);
                characters[i] = s.charAt(j);
                i++;
                j--;
            } else {
                if (containsChar(s.charAt(i))) {
                    characters[j] = s.charAt(j);
                    j--;
                } else if (containsChar(s.charAt(j))) {
                    characters[i] = s.charAt(i);
                    i++;
                } else {
                    characters[i] = s.charAt(i);
                    characters[j] = s.charAt(j);
                    i++;
                    j--;
                }
            }
        }
        if (blankFlag) {
            return s;
        }
        if (i < s.length()) {
            characters[i] = s.charAt(i);
        }
        if (j > 0) {
            characters[j] = s.charAt(j);
        }
        return new String(characters);
    }

    public static boolean containsChar(char target) {
        return "aeiouAEIOU".indexOf(target) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels(" "));
    }
}
