import java.util.ArrayList;
import java.util.List;

public class LongestObstacleCourseAtEachPosition {
    public static void main(String argu[]) {
        int arr[] = { 3, 1, 5, 6, 4, 2 };
        int ans[] = longestObstacleCourseAtEachPosition(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] longestObstacleCourseAtEachPosition(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        int count = 1;
        temp.add(count);
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] != arr[j]) {
                    x++;
                }
            }
            if (x == i) {
                count++;
            }
            x = 0;
            temp.add(count);
        }
        int ans[] = new int[temp.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
