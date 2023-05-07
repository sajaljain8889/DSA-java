
public class FirstLEmntOccursKtimes {

    public static void main(String argu[]) {

        int a[] = { 1, 7, 9, 9, 9, 2, 6, 7, 7, 7 };
        int n = 10;
        int k = 3;
        int ans = 0;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, a[i]);
        }
        int count[] = new int[mx + 1];

        for (int i = 0; i < mx + 1; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
            if (count[a[i]] >= k - 1) {
                ans = a[i];
                System.out.println(ans);
                break;
            }
        }

        // for (int i = 0; i < mx + 1; i++) {
        // if (count[i] >= k) {
        // System.out.println(i);
        // break;
        // } else if (i == mx + 1 && count[i] < k) {
        // System.out.println("-1");
        // }
        // }
        // System.out.println(ans);
    }

}
