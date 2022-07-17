import java.util.Scanner;

public class Task28 {
    public static int sum_num(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num + sum_num(num-1);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        if (num<0)
        {
            System.out.println("Oops given number is negative please provide positive number ");
        }
        else
        {
            int result = sum_num(num);
            System.out.println("Sum of the range from 1 to "+num+ " is: "+result);
    }
    }



}
