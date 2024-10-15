import java.util.*;

public class javakhul {
    // public static int factorial(int n) {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = Sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }

        System.out.println(f);
    }
}
