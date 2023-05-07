
public class SumOfTwoArrays {
    public static void main(String[] args) {

        int[] a = { 2, 3, 9, 0, 3, 4, 6, 8 };
        int[] b = { 1, 2, 3, 9, 1, 2, 4, 5, 1 };
        int max = Math.max(a.length, b.length);
        int[] c = new int[max + 1];
        int i, j, k, sum;
        int carry = 0;
        for (i = a.length - 1, j = b.length - 1, k = max; j >= 0; i--, j--, k--) {
            if (i >= 0)
                sum = a[i] + b[j] + carry;
            else
                sum = b[j] + carry;
            if (sum >= 10)
                carry = 1;
            else
                carry = 0;
            c[k] = sum % 10;
        }

        for (int l : c) {
            System.out.println(l);

        }

    }

}
