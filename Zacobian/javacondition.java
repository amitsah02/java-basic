import java.util.*;

public class javacondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question:1
        // Question:2
        // double temp = 103.5;
        // if (temp > 100) {
        // System.out.println("you have Fever");
        // } else {
        // System.out.println("you donot have Fever");
        // }
        // Question:3
        // System.out.println("Enter days of week");
        // int day = sc.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("Sunday");

        // break;

        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // case 5:
        // System.out.println("Thursday");

        // break;
        // case 6:
        // System.out.println("Friday");

        // break;
        // case 7:
        // System.out.println("Saturday");

        // break;

        // default:
        // System.out.println("wrong day");
        // break;
        // }
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println(" not a leap year");

        }

    }
}