//17 Sum of digitsJAVA program to print sum of digits. (eg. 512 = 8 )

import java.util.*;
class Sum
{
    public static void main(String[] args) {
        int number, sum=0;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while(number>0)
        {
            int digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println("Sum of the given number: "+sum);
    }
}