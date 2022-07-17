import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        int row, i, j, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the Matrix:");
        row = sc.nextInt();
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.print("Enter all the elements of first matrix: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Original Matrix:\n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int r = arr.length;
        int c = arr[0].length;
        int newarr[][] = new int[c][r];
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                newarr[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of the Matrix is: ");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
