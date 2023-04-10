public class DiffOfTwoArrays {
    public static void main(String argu[]) {
        int a[] = { 7, 6, 3, 1, 9, 8 };
        int b[] = { 8, 9, 6, 7, 4 };
        int max = Math.max(a.length, b.length);
        int ans[] = new int[max];

        int i = a.length - 1;
        int j = b.length - 1;
        int k = max - 1;
        while (k >= 0 && j >= 0) {
            if (b[j] > a[i]) {
                a[i] += 10;
                a[i - 1] -= 1;

            }
            ans[k] = a[i] - b[j];
            i--;
            j--;
            k--;
        }

        ans[k] = a[i];
        for (int x : ans) {
            System.out.print(x);
        }

    }
}
