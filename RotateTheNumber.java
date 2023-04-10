import java.util.*;
import java.lang.*;

public class RotateTheNumber {
    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int temp = n; // 23456
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        int div = 1;
        int multi = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                multi = multi * 10;
            }
        }

        int r = n % div;
        int q = n / div;

        int ans = r * multi + q;
        System.out.println(ans);

    }
}
