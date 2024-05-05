package cool.jancy;

import java.util.ArrayList;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : Solution
 * @description: TODO
 * @date 2023/12/5 20:31
 */
class GcdOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        ArrayList<Integer> commonFactors = new ArrayList<>();

        int smallerNumber = Math.min(str1.length(), str2.length());

        for (int i = 1; i <= smallerNumber; i++) {
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                commonFactors.add(i);
            }
        }
        int i1;
        boolean flag;
        if (str1.length() >= str2.length()) {
            i1 = str1.length();
            flag = true;
        } else {
            i1 = str2.length();
            flag = false;
        }
        for (int i = commonFactors.size() - 1; i >= 0; i--) {
            Integer count = commonFactors.get(i);
            boolean result = true;
            int j = 0;
            while (j < i1) {
                int x = 0;
                if (flag) {
                    while (x < str2.length()) {
                        if (!str1.substring(j, count + j).equals(str2.substring(x, count + x))) {
                            result = false;
                        }
                        x += count;
                    }
                } else {
                    while (x < str1.length()) {
                        if (!str1.substring(x, count + x).equals(str2.substring(j, count + j))) {
                            result = false;
                        }
                        x += count;
                    }
                }
                j += count;
            }
            if (result) {
                return str1.substring(0, count);
            }
        }
        return "";
    }


    public static void main(String[] args) {
        System.out.println(gcdOfStrings("AAAAAAAAA", "AAACCC"));
    }
}
