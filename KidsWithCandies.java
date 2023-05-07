import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String argu[]) {
        List<Integer> candies = new ArrayList<>();
        int xtraCandies = 3;
        candies.add(2);
        candies.add(3);
        candies.add(5);
        candies.add(1);
        candies.add(3);
        int[] candy = { 12, 1, 12 };
        List<Boolean> result = kidsWithCandies(candy, xtraCandies);
        for (Boolean boolean1 : result) {
            System.out.println(boolean1);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>(n);
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, candies[i]);
        }

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies > mx) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
