public class MaxVowels {
    public static void main(String argu[]) {
        String str = "abciiidef";
        int k = 3;
        int ans = maxVowels(str, k);
        System.out.println(ans);
    }

    private static int maxVowels(String str, int k) {
        int currVowels = 0;
        int maxVowel = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i >= k && isVowel(str.charAt(i - k))) {
                currVowels--;
            }

            if (isVowel(str.charAt(i))) {
                currVowels++;
            }
            maxVowel = Math.max(currVowels, maxVowel);
        }

        return maxVowel;
    }

    private static boolean isVowel(char x) {
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }
}
