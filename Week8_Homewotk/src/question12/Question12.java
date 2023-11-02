package question12;

//Same as above program-8 using switch statement.

import java.util.ArrayList;
import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        Number(ch);
        sc.close();
    }
    public static void Number(char ch){
        ArrayList<String>Number= new ArrayList<String>();
        System.out.println("Enter positive");

    }
}
