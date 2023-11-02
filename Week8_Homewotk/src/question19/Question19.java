package question19;

//19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        if (num>0){
            System.out.println("Number is positive ");
        }
        else if (num<0){
            System.out.println("Number is negative");
        }
        else if (num==0) {
            System.out.println("Number is zero");
        }else {
            System.out.println("Number is invalid");
        }
    }
}
