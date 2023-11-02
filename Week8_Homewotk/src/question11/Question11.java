package question11;

//11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
//other alphabet should be invalid entry.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        Question11 que = new Question11();
        que.m1();

    }
    public void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Any Alphabet = ");
        char c = sc.next().charAt(0);

        if (c =='A'|| c == 'a'){
            System.out.println("Amritsar");
        } else if (c =='B'|| c == 'b'){
            System.out.println("Brampton");
        }else if (c =='C'|| c == 'c'){
            System.out.println("Celadon");
        }else if (c =='D'|| c == 'd') {
            System.out.println("Dixon");
        }else if (c =='E'|| c == 'e') {
            System.out.println("Egypt");
        }else if (c =='F'|| c == 'f'){
            System.out.println("Florida");
    }
        else
            System.out.println("Invalid Entry");
    }
}
