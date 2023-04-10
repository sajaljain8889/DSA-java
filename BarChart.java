import java.util.*;

public class BarChart {
    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        int max = num[0];

        for (int i = 1; i <= n; i++) {
            max = Math.max(max, i);
        }

        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < num.length; i++) {
                if (num[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
        }
        System.out.println();
    }
}
