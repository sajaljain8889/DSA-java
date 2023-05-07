
public class containerDiffApproach {
    public static void main(String argu[]) {
        int hieght[] = { 1, 1 };
        int ans = solution(hieght);
        System.out.println(ans);
    }

    private static int solution(int[] hieght) {
        int ans = 0;
        int left = 0;
        int right = hieght.length - 1;
        while (left < right) {

            if (hieght[left] < hieght[right]) {
                ans = Math.max(ans, hieght[left] * (right - left));
                left++;
            } else {
                ans = Math.max(ans, hieght[right] * (right - left));
                right--;
            }
        }
        return ans;
    }
}
