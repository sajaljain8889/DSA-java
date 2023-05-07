import java.util.Arrays;

public class MedianOfSortedArrays {
    public static void main(String argu[]) {
        int nums1[] = { 1, 3, 4, 8 };
        int nums2[] = { 2, 7 };
        double ans = medianOfSortedArrays(nums1, nums2);
        System.out.println(ans);
    }

    private static double medianOfSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans[] = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nums1[i] > nums2[j]) {
                ans[k] = nums2[j];
                j++;
            } else {
                ans[k] = nums1[i];
                i++;
            }
            k++;
        }

        while (i < n) {
            ans[k] = nums1[i];
            i++;
            k++;
        }

        while (j < m) {
            ans[k] = nums2[j];
            j++;
            k++;
        }

        // System.out.println(ans.length);
        double result = 0;
        int x = ans.length / 2;
        if (ans.length % 2 == 0) {
            result = (ans[x - 1] + ans[x]);
            result = result / 2;
        } else {
            result = ans[x];
        }

        return result;

    }
}
