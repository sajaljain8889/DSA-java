
public class ContainerwithMostWater {

    public static void main(String argu[]) {
        int hieght[] = { 1, 1 };
        int ans = solution(hieght);
        System.out.println(ans);
    }

    public static int solution(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}