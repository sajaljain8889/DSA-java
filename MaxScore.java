public class MaxScore {
    public static void main(String argu[]) {
        int arr[] = { 3, 4, 6, 8 };
        int ans = maxScore(arr);
        System.out.println(ans);
    }

    private static int maxScore(int[] arr) {
        int n = arr.length;
        int j = 1;
        int score = 0;
        int mxScore = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i + 1 < n; i += 2) {
            j = i + 1;
            score = j * gcd(arr[j - 1], arr[j]);
            mxScore = Math.max(mxScore, score);
        }
        return mxScore;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
