public class MaxmVowelsinSbStringGvnLength {

    public static void main(String argu[]) {
        String str = "weallloveyou";
        int k = 7;
        int ans = maxmVowelsinSbStringGvnLength(str, k);
        System.out.println(ans);
    }

    private static int maxmVowelsinSbStringGvnLength(String str, int k) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i <= str.length() - k; i++) {

            count = 0;
            for (int j = i; j < k + i; j++) {
                if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
                        || str.charAt(j) == 'u') {
                    count++;
                }
            }

            ans = Math.max(ans, count);
            if (ans == k) {
                break;
            }
        }

        return ans;
    }

}
