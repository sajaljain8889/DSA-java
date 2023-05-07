public class Ctnrwidmostwtr {
    public static void main(String argu[]) {
        int hieght[] = { 1, 1 };
        int ans = solution(hieght);
        System.out.println(ans);
    }

    private static int solution(int[] hieght) {
        int ans = 0;
        for (int i = 0; i < hieght.length; i++) {
            for (int j = i + 1; j < hieght.length; j++) {
                if (hieght[i] < hieght[j]) {
                    ans = Math.max(ans, hieght[i] * (j - i));
                } else {
                    ans = Math.max(ans, hieght[j] * (j - i));
                }
            }
        }
        return ans;
    }
}
