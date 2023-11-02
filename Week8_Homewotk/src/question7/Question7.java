package question7;

//Write a java program to input any number and find out if it’s odd or even.

public class Question7 {

    public static void main(String[] args) {
        int number = 5;
        if (number % 2 == 0) {
            System.out.println(number + " is even ");
        } else{
            System.out.println(number + " is odd ");
        }
    }
}
