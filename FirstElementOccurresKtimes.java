import java.util.HashMap;
import java.util.Map;

public class FirstElementOccurresKtimes {
    public static void main(String argu[]) {
        int a[] = { 4, 2, 2, 2, 3, 4, 4, 4, 3, 2 };
        int n = 10;
        int k = 2;

        int ans = firstElementOccurresKtimes(a, n, k);
        System.out.println(ans);
    }

    private static int firstElementOccurresKtimes(int[] a, int n, int k) {

        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (temp.containsKey(a[i])) {
                temp.put(a[i], temp.get(a[i]) + 1);
            } else {
                temp.put(a[i], 1);
            }
        }

        int ans = 0;

        for (int i : temp.keySet()) {
            if (temp.get(i) == k) {
                ans = i;
                break;
            }
        }

        for (int i : temp.keySet()) {
            System.out.println(i + "  " + temp.get(i));
        }

        return ans;
    }
}
