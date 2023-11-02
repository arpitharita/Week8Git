package question15;

//Write a program that tells us input value is number or an alphabet orsymbol.

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //scanner class

        System.out.println("Enter any character : "); //print statement
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {  //using if & else

            System.out.println(ch + " Is A ALPHABET.");

        } else{
            System.out.println(ch + "Is A SYMBOL");
        }
    }
}
