package Graph;

import java.util.Scanner;

public class RottenOranges {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println(grid[i][j]);
            }
        }

        int result = orangesRotting(grid);
        System.out.println(result);
    }

    private static int orangesRotting(int[][] grid) {
        return 0;
    }
}
