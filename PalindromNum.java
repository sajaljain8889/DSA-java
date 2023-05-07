public class PalindromNum {
    public static void main(String argu[]) {
        int x = 121;
        boolean flag = palindromNum(x);
        System.out.println(flag);
    }

    public static boolean palindromNum(int x) {
        boolean flag = false;
        if (x > 0) {
            int rem = 0;
            int ans = 0;
            int comparator = x;
            while (x > 0) {
                rem = x % 10;
                System.out.println("x =" + x);
                System.out.println("reminder =" + rem);
                x = x / 10;
                ans = ans * 10 + rem;

                System.out.println("Answer =" + ans);

            }

            if (ans == comparator) {
                flag = true;
            }

        }

        return flag;
    }
}
