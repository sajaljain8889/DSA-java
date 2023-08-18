public class DiagonalSumOfaMatrix {
    public static void main(String argu[]) {
        int[][] arr = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        // { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = diagonalSumOfaMatrix(arr);
        System.out.println(sum);

    }

    private static int diagonalSumOfaMatrix(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                } else if (i + j == n - 1) {
                    if (i != j) {
                        sum += arr[i][j];
                    }
                }
                System.out.print(i + " " + j + "    ");
            }
            System.out.println("  ");
        }
        return sum;
    }
}