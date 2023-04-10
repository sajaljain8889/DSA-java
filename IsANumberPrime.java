import java.util.*;

public class IsANumberPrime {
    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("is a prime number");
            } else {
                System.out.println("not a prime number");
            }
        }
    }
}
