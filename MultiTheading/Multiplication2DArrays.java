package MultiTheading;

import java.util.Scanner;

public class Multiplication2DArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put rows and column for 1st arrray");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] first = new int[row1][col1];
        System.out.println("-----------------------------------------------");

        // rows
        for (int i = 0; i < row1; i++) {
            // columns
            for (int j = 0; j < col1; j++) {
                first[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------------------------------------");

        // rows
        for (int i = 0; i < row1; i++) {
            // columns
            for (int j = 0; j < col1; j++) {
                System.out.print(first[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");

        System.out.println("put rows and column for 2st arrray");

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] second = new int[row2][col2];
        System.out.println("-----------------------------------------------");

        // rows
        for (int i = 0; i < row2; i++) {
            // columns
            for (int j = 0; j < col2; j++) {
                second[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------------------------------------");

        // rows
        for (int i = 0; i < row2; i++) {
            // columns
            for (int j = 0; j < col2; j++) {
                System.out.print(second[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Multiplicated Matrix");

        if (row1 != col2) {
            System.out.println("Invalid Input");
        }

        int[][] prod = new int[row1][col2];
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k = 0; k < row2; k++) {
                    prod[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
