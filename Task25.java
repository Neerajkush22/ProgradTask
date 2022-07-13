/*Task 25 Write a Java program for bonus calculation. Accept basic salary from user.
Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary.
Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF) **/

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        double bas_sal,HRA,TA,PF,DA,gross_sal,bonus;
        System.out.println("Enter Your Basic Salary: ");
        Scanner sc = new Scanner(System.in);
        bas_sal = sc.nextDouble();
        HRA = bas_sal*0.2;
        PF = bas_sal*0.12;
        DA = bas_sal*0.15;
        TA = bas_sal*0.10;
        System.out.println("House Rent Allowance is: "+HRA);
        System.out.println("Provident Fund is: "+PF);
        System.out.println("Dearness Allowance is: "+DA);
        System.out.println("Traveling Allowance is: "+TA);
        if(bas_sal>=20000 )
        {
            bonus = bas_sal*0.1;

        }
        else
        {
            bonus = bas_sal*0.2;


        }
        gross_sal = bas_sal+DA+TA+HRA+bonus-PF;
        System.out.println("Gross Salary of an Employee is: "+gross_sal);
    }
}
