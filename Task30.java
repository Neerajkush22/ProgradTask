import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        int num, sum = 0;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < num ; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / num;
        System.out.println("Average:"+average);
    }
}
