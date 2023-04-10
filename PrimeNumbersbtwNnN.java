import java.util.*;

public class PrimeNumbersbtwNnN {

    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        int high = scan.nextInt();
        int low = scan.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;
            //
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
