import java.util.*;

public class FFibbonacci {
    public static void main(String argu[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
