import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        int num, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter all the elements:");
        for (i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Even numbers are: ");
        for (i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd numbers are: ");
        for (i = 0; i < num; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
