public class testReverseInte {
    public static void main(String argu[]) {
        int x = 123;
        int ans = gestReverseInte(x);
        System.out.println(ans);
    }

    private static int gestReverseInte(int x) {
        int sign = (x < 0) ? -1 : 1;

        // Convert x to a positive integer for reversal.
        x = Math.abs(x);

        // Reverse the digits of x.
        int result = 0;
        while (x > 0) {
            // Check for overflow before adding the next digit.
            if (result > (Integer.MAX_VALUE / 10) ||
                    (result == (Integer.MAX_VALUE / 10) && (x % 10 > Integer.MAX_VALUE % 10))) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }

        // Apply the sign to the reversed integer.
        result *= sign;

        return result;
    }
}
