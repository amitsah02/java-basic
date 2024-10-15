import java.util.*;

class student {
    int roll;
    int marks;
    String name;

    void input() {
        System.out.println("Enter roll,names & marks");

    }
}

class amit extends student {
    void disp() {
        roll = 1;
        name = "amit";
        marks = 98;
    }

    public static void main(String args[]) {
        amit r = new amit();
        r.input();
        r.disp();
    }
}
