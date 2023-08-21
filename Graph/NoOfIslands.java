import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslands {

    public static class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String args[]) {
        // Scanner scanner = new Scanner(System.in);
        // int m = scanner.nextInt();
        // int n = scanner.nextInt();

        // int[][] grid = new int[m][n];
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // grid[i][j] = scanner.nextInt();
        // }
        // }

        int[][] grid = {
                { 1, 1, 1, 1, 0 },
                { 1, 1, 0, 1, 0 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[0].length; j++) {

                System.out.print(grid[i][j] + " ");
            }
        }

        int ans = noOfIslands(grid);
        System.err.println(ans);
    }

    private static int noOfIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int islandCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    islandCount++;
                    bfs(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private static void bfs(int[][] grid, int startRow, int startCol) {
        Queue<Pair> q = new LinkedList<>();
        int[] dRow = { -1, 0, 1, 0 };
        int[] dCol = { 0, 1, 0, -1 };
        int m = grid.length;
        int n = grid[0].length;
        q.add(new Pair(startRow, startCol));
        grid[startRow][startCol] = 0;

        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nRow = r + dRow[i];
                int nCol = c + dCol[i];
                if (nRow >= 0 && nCol >= 0 && nCol < n && nRow < m && grid[nRow][nCol] == 1) {
                    grid[nRow][nCol] = 0;
                    q.add(new Pair(nRow, nCol));
                }
            }

        }
    }
}
