import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int on1 = a;
        int on2 = b;
        int large = a > b ? a : b;
        int gcd = 1;
        for (int i = large / 2; i > 1; i--) {
            if (b % i == 0 && a % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("Greatest Comman Devisor " + gcd);

        int lcm = (on1 * on2) / gcd;
        System.out.println("Least Comman Multiplier " + lcm);
    }

}
