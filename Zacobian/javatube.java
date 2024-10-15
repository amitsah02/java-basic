import java.util.Scanner;

class Student {
    int roll;
    int marks;
    String name;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number:");
        roll = scanner.nextInt();
        System.out.println("Enter name:");
        name = scanner.next();
        System.out.println("Enter marks:");
        marks = scanner.nextInt();
        scanner.close();
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Amit extends Student {
    void disp() {
        roll = 1;
        name = "Amit";
        marks = 98;
    }

    public static void main(String args[]) {
        Amit r = new Amit();
        r.input();
        r.disp();
        r.display();
    }
}
