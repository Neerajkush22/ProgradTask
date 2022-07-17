import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        int range,i,j;
        int alpha = 65;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of the Pattern: ");
        range = sc.nextInt();;
        for(i=0;i< range;i++)
        {
            for(j = i;j<range;j++)
            {
                System.out.print((char)(j+alpha));
            }
            System.out.println();
        }

    }
}
