public class SumofTwoArrays {
    public static void main(String argu[]) {
        int a[] = { 8, 9, 6, 7, 4 };
        int b[] = { 7, 6, 3, 1, 9, 8 };
        int max = Math.max(a.length, b.length);
        int ans[] = new int[max];
        int c = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        int k = max - 1;

        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d += a[i];
            }

            if (j >= 0) {
                d += b[j];
            }

            c = d / 10;
            d = d % 10;

            ans[k] = d;

            i--;
            j--;
            k--;
        }
        if (c != 0) {
            ans[k] = c;
        }

        for (int x : ans) {
            System.out.print(x);
        }

    }
}
