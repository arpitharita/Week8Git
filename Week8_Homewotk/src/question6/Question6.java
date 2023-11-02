package question6;

//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
//| Salary Slip |
//| |
//| |
//| Employee Id : 2564 |
//| Employee Name : Jay |
//|
//|
//| Basic Salary : 25000.0 |
//| HRA 10% : 2500.0 |
//| TA 8% : 2250.0 |
//| DA 9% : 2000.0 |
//| PF - 20& : 5000.0 |
//|
//|
//| Gross Salary : 26750.0 |
//|===========================|

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("|------------------------------|");
        System.out.println("|    Salary slip               |");
        System.out.println("|------------------------------|");
        System.out.println("|Employee id     : joy         |");
        System.out.println("|Employee name   :5688         |");
        System.out.println("|------------------------------|");
        System.out.println("|Basic Salary  :               |");
        double sal = sc.nextDouble();
        double DA = 8 / 100.0 * sal;
        System.out.println("|  DA 8%  "               +DA    );
        double HRA = 10 / 100.0 * sal;
        System.out.println("|HRA 10%  "               +HRA   );
        double TA = 9 / 100.0 * sal;
        System.out.println("|TA   9%"                  +TA   );
        double PF = 20/100.0 * sal;
        System.out.println("|PF  20&"                  +PF   );
        double grosssalary = sal+HRA+TA+DA-PF;
        System.out.println("|------------------------------|");
        System.out.println("|Gross Salary = " + grosssalary  );
        System.out.println("|==============================|");

    }
}
