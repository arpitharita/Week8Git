package question8;

//8. Write a java program to get numbers from users and print whether it is positive or negative.

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in); //Scanner class
        System.out.println("Enter Number"); //print statement
        number = sc.nextInt();
        if (number>0){
            System.out.println("Number is Positive"); //+1 to .... positive
        } if (number<0) {
            System.out.println("Number is Negative");  //- 1 to .... negative
        }else {
            System.out.println("Number is Zero");
        }

    }
}
