package question1;

//1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
//operator (? :)

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num%2 == 1){
            System.out.println(num + " Number is Even ");
        }else {
            System.out.println(num + "Number is Odd");
        }

    }

}
