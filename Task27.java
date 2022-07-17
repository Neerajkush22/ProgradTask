import java.util.Scanner;

public class Task27 {
    public int fact_table(int num,int i)
    {
        if(i>10)
        {
            return i;
        }

        System.out.println(num+ "*" +i+ "=" + num*i);
        return fact_table(num,i+1);


    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        Task27 obj = new Task27();
        obj.fact_table(num,1);
    }
}
