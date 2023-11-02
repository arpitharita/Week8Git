package question21;

//21. Write a Java program to sum values of an array.

public class Question21 {

    static int[] m1 = {25, 20, 30, 45, 36, 15, 55};

    static int m2() {
        int m2 = 0;
        int i;

        for (i = 0; i < m1.length; i++) m2+= m1[i];
        return m2;
    }

    public static void main(String[] args) {
        System.out.println("Sum value of array is :" +m2());
    }
}
