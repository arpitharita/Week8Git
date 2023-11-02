package question10;

//10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
//fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sales ID");
        int id =sc.nextInt();
        System.out.println("Seller's Name");
        String string =sc.next();
        System.out.println("Sales Amount");
        int salesamount = sc.nextInt();

        double Commission,balance;

        if (salesamount >= 50000){
            System.out.println("Sales Commission " +(salesamount*35/100));
        }  else if ((salesamount >= 30000)) {
            System.out.println("Sales Commission is " +(salesamount*30/100));
        }
        else if (salesamount >= 20000) {
            System.out.println("Sales Commission is " +(salesamount*35/100));
        } else if (salesamount >= 30000) {
            System.out.println("Sales Commission is " +(salesamount*30/100));
        } else if (salesamount >= 20000) {
            System.out.println("Sales Commission is " +(salesamount*20/100));
        } else if (salesamount >= 10000) {
            System.out.println("Sales Commission is " +(salesamount*5/100));

        }
        else {
            System.out.println("Sales Commission is " +(salesamount*2/100));
        }

    }
}
