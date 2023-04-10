import java.util.*;

public class MaximumSubarraySum {
    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int currSum[] = new int[n + 1];
        currSum[0] = arr[0];
        for (int i = 1; i <= n; i++) {
            currSum[i] = currSum[i - 1] + arr[i - 1];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum = currSum[i] - currSum[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
