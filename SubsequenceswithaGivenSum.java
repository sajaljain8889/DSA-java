import java.util.ArrayList;
import java.util.List;

public class SubsequenceswithaGivenSum {

    public static void main(String argu[]) {
        int arr[] = { 3, 5, 6, 7 };
        int target = 9;
        int ans = subsequenceswithaGivenSum(arr, target);
        System.out.println(ans);
    }

    private static int subsequenceswithaGivenSum(int[] arr, int target) {
        int sum = 0;
        int count = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.err.println(arr[i] + " " + arr[j]);
            }
        }

        // for (Integer x : temp) {
        // System.out.println(x);
        // }

        return count;
    }

}
