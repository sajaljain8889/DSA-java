public class SignOfProductOfArray {
    public static void main(String argu[]) {
        int arr[] = { -41, -22, 22, -84, 9, -92, -97, 42, 40, 48, 71, 63, 29, 5, -66 };
        int ans = signOfProductOfArray(arr);
        System.out.println(ans);
    }

    private static int signOfProductOfArray(int[] arr) {
        int count = 1;
        int one = 1;
        int minus = -1;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i] + " --> count --> " + count);

                count = count * minus;
            } else if (arr[i] > 0) {
                count = count * one;
            } else {
                count = count * zero;
            }
        }
        return count;

    }

}
