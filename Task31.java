import java.util.*;


public class Task31 {
    public static void main(String[] args) {
        int name;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        name = s.nextInt();
        String names[] = new String[name];
        System.out.println("Enter all the names:");
        for (int i = 0; i < name; i++) {
            names[i] = s.nextLine();
        }
        Arrays.sort(names);
        System.out.println("The names in alphabetical Order: ");
        for(int i = 0;i<name;i++)
        {
            System.out.println(names[i]);
        }
    }
}
