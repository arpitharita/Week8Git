package question14;

//14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
//5 separately.

public class Question14 {

    public static void main(String[] args) { // main method

        System.out.println(" \nDivided by 3: "); //division
        for (int i = 1; i < 100; i++) {  //for loop
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

    }
}
