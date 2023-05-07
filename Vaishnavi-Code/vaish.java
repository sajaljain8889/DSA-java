
public class vaish {
    public static void main(String argu[]) {
        String str = "weallloveyou";
        int k = 7;
        int ans = maxmVowelsinSbStringGvnLength(str, k);
        System.out.println(ans);
    }

    private static int maxmVowelsinSbStringGvnLength(String str, int k) {
        int c1, c2;
        c1 = c2 = 0;

        for (int i = 0; i <= str.length() - k; i++) {
            c2 = 0;
            int j = i;
            int s = 0;
            while (s < k) {

                if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
                        || str.charAt(j) == 'u')

                    c2++;

                s++;
                j++;

            }

            if (c2 > c1)
                c1 = c2;
        }
        return c1;

    }

}