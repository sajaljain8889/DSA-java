import java.util.ArrayList;

public class SubarrayWithAGivenSum {

    public static void main(String argu[]) {
        int arr[] = { 1, 2, 3, 5, 7, 8, 9, 4, 2 };
        int n = arr.length;
        int s = 17;
        ArrayList<Integer> ans = subarraySum(arr, n, s);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        if (s == 0) {
            a.add(-1);
            return a;
        }
        int i = 0, j = 0;
        int sum = arr[0];
        while (j < n) {
            if (sum == s) {
                a.add(i + 1);
                a.add(j + 1);
                return a;
            } else if (sum < s) {
                j++;
                if (j < n) {
                    sum += arr[j];
                }
            } else {
                sum -= arr[i];
                i++;
            }
        }

        a.add(-1);
        return a;

    }

}
