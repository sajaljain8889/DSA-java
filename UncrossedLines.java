public class UncrossedLines {
    public static void main(String argu[]) {
        int nums1[] = { 2, 5, 1, 2, 5 };
        int nums2[] = { 10, 5, 2, 1, 5, 2 };
        int ans = uncrossedLines(nums1, nums2);

    }

    private static int uncrossedLines(int[] nums1, int[] nums2) {
        int count1 = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 1; j < nums2.length - 1; j++) {
                if (nums1[i] == nums2[j - 1]) {
                    count1++;
                } else if (nums1[i] == nums2[j - 1] && i < j - 1) {
                    count1++;
                }
            }
        }

        for (int i = nums1.length; i >= 0; i--) {
            for (int j = nums2.length; j >= 0; j--) {

            }
        }
        return 0;
    }
}
