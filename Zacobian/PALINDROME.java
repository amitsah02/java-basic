import java.util.*;

// import java.util.Scanner;

public class PALINDROME {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int r, c, s = 0;
        c = n;
        while (n > 0) {
            r = n % 10;
            s = ((s * 10) + r);
            n = n / 10;
        }
        if (c == s) {
            System.out.println("palindrome Number");
        } else {
            System.out.println(" not palindrome Number");
        }

    }

}
