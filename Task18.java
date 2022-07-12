//18 Reverse the numberJAVA program to reverse the given number.
import java.util.*;

class Reverse
{
    public static void main(String[] args) {
        int number,remainder,reverse = 0;
        System.out.println("Enter the number to be reversed: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while(number != 0)
        {
            remainder = number % 10;
            reverse = reverse*10 + remainder;
            number = number/10;

        }
        System.out.println("Number after Reversed: "+reverse);
    }
}