import java.util.Arrays;

public class CheckBothArrayIsEqualorNot {
    public static void main(String argu[]) {
        int arr1[] = { 1, 2, 5, 4, 0 };
        int arr2[] = { 2, 4, 5, 9, 1 };
        int n = 5;
        boolean ans = checkBothArrayIsEqualorNot(arr1, arr2, n);
        System.out.println(ans);
    }

    private static boolean checkBothArrayIsEqualorNot(int[] arr1, int[] arr2, int n) {
        boolean flag = false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }

        if (count == n) {
            flag = true;
        }

        return flag;
    }
}
