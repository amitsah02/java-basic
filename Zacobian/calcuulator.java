import java.util.*;

public class calcuulator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            default:
                System.out.println("wrong operator");
                break;
        }
    }
}
