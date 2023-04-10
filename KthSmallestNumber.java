public class KthSmallestNumber {
    public static void main(String argu[]) {
        int arr[] = { -1, 0, -6, 2, 5, 1 };
        int k = 1;
        int x = 0;

        int ans[] = new int[k];
        int min = arr[0];
        int mx = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 1; j < arr.length; j++) {

                if (arr[j] > mx) {
                    mx = arr[j];
                }
                if (arr[j] < min) {
                    min = arr[j];
                    x = j;
                }

            }
            ans[i] = min;
            min = arr[0];
            arr[x] = mx + 1;

        }

        System.out.println(ans[k - 1]);

    }
}
