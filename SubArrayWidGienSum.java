import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWidGienSum {
    public static void main(String argu[]) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        int s = 12;
        ArrayList<Integer> ans = subarraySum(arr, n, s);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum[] = new int[n];
        currSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            currSum[i] = currSum[i - 1] + arr[i];
        }

        // for (int i = 0; i < n; i++) {
        // System.out.println(currSum[i]);
        // }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            if (currSum[i] == s) {
                ans.add(1);
                ans.add(i + 1);
                break;
            }

            if (map.containsKey(currSum[i] - s)) {
                int startIndex = map.get(currSum[i] - s) + 2;
                ans.add(startIndex);
                ans.add(i + 1);
                break;
            }

            map.put(currSum[i], i);

        }

        return ans;
    }
}
