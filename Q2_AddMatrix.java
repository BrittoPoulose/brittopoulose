import java.io.*;
import java.util.Scanner;

class Q2_AddMatrix {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int row, col, i, j;

        System.out.println("Enter the number of rows");
        row = sc.nextInt();

        System.out.println("Enter the number columns");
        col = sc.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int sum[][] = new int[row][col];

        System.out.println("Enter the elements to matrix 1: \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }

        }

        System.out.println("Enter the elements of matrix 2: \n");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }

        }

        System.out.println("Sum of matrices is");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("\n");

        }
        sc.close();
    }
}
