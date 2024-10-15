import java.util.Scanner;

public class sevent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        // int n;
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("odd number");
        }
    }
}
