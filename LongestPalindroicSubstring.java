public class LongestPalindroicSubstring {
    public static void main(String argu[]) {
        String str = "abb";
        System.out.println(str.length());

        String ans = longestPalindroicSubstring(str);
        System.out.println(ans);
    }

    private static String longestPalindroicSubstring(String str) {
        int mx = 1, st = 0, end = 0;
        String temp = " ";
        if (str.length() == 2 && str.charAt(0) == str.charAt(1)) {
            return str;
        } else if (str.length() == 1) {
            return str;
        }
        ;

        if (str.length() % 2 == 0) {
            for (int i = 1; i < str.length(); ++i) {
                int l = i, r = i + 1;

                while (l >= 0 && r < str.length()) {
                    if (str.charAt(l) == str.charAt(r)) {
                        temp = str.substring(l, r + 1);
                        if (mx < temp.length()) {
                            mx = temp.length();
                            st = l + 1;
                            end = r - 1;
                        }
                    } else {
                        break;
                    }
                    l--;
                    r++;
                }

            } // b a b a d
        } else {
            for (int i = 1; i < str.length(); ++i) {
                int l = i, r = i;

                while (l >= 0 && r < str.length()) {
                    if (str.charAt(l) == str.charAt(r)) {
                        temp = str.substring(l, r + 1);
                        if (mx < temp.length()) {
                            mx = temp.length();
                            st = l;
                            end = r;
                            System.out.println(l + " " + r);
                            System.out.println(str.substring(l, r + 1));
                        }
                    } else {
                        break;
                    }
                    l--;
                    r++;

                }

            }
        }

        return str.substring(st, end + 1);

    }

}
