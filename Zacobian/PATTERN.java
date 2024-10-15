public class PATTERN {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1 + " ");

                } else {
                    System.out.print(0 + " ");
                }
            }
        }
    }

}

class Pat {
    public static void main(String args[]) {
        for (int i = 0; i < 6; i++) {
            int k = i + 1;
            for (int j = 0; j <= i; j++) {
                int l = (k % 2);
                System.out.print(l);
                k++;
            }
            System.out.println();
        }
    }
}