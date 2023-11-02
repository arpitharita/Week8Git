package question16;

//16. Write a Java program which input any number between 1 to 7 and it print The Daysname
//MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
//number is out of selection Print message “Week contains 1 to 7 days”

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    public static String getDayName(int Day) {
        String Dayname = " ";
        switch (Day) {
            case 1: Dayname = "Monday"; break;
            case 2: Dayname = "Tuesday"; break;
            case 3: Dayname = "Wednesday"; break;
            case 4: Dayname = "Thursday"; break;
            case 5: Dayname = "Friday"; break;
            case 6: Dayname = "Saturday"; break;
            case 7: Dayname = "Sunday"; break;
            default:Dayname = "Invalid day range";
        }

        return   Dayname;
    }
}
