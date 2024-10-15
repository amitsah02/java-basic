import java.util.*;

public class javasikho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator");
        // char operator;
        char operator = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case '+':
                System.out.println("The Addition is:" + (a + b));
                break;
            case '-':
                System.out.println("The Subtraction is:" + (a - b));
                break;
            case '*':
                System.out.println("The Multiplication is:" + (a * b));
                break;
            case '/':
                System.out.println("The Division is:" + (a / b));
                break;
            default:
                System.out.println("wrong operator");
                break;
        }

    }
}
