public class LovelyCards {
    public static void main(String argu[]) {
        int n = 3;

        int[] arr = { 2, 1, 4 };
        int ans = lovelyCards(arr, n);
        System.out.println(ans);
    }

    private static int lovelyCards(int[] arr, int n) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (swap(arr[i], arr[i - 1])) {
                ans = 1;
                break;
            }
        }
        return ans;
    }

    private static boolean swap(int i, int j) {
        boolean flag = false;
        int temp = 0;
        temp = i;
        i = j;
        j = temp;
        if ((i + j) / 2 != 0) {
            flag = true;
        }
        return flag;
    }

}
