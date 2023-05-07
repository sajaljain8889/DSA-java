import java.util.*;

public class InverseOfNumber {
    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 3 1 4 2 5 -->1 3 5 2 4

        int oNum = n;

        int dig = 0;
        int rNum = 0;
        int p = 0;
        int inverse = 0;

        while (n != 0) {
            dig = n % 10;
            n = n / 10;

            p++;
            int mlpr = 1;

            for (int i = 1; i < dig; i++) {
                mlpr = mlpr * 10;
            }
            inverse = p * mlpr + inverse;

        }
        System.out.println("Inverse number of " + oNum + " is " + inverse);
    }
}
