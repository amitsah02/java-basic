public class MultiThreadedExample {
    public static void main(String[] args) {
        // Creating and starting two additional threads
        Thread thread1 = new Thread(() -> System.out.println("Multi-threaded: Task 1"));
        Thread thread2 = new Thread(() -> System.out.println("Multi-threaded: Task 2"));

        thread1.start();
        thread2.start();

        // Code executed by the main thread
        System.out.println("Multi-threaded: Task 3");
    }
}