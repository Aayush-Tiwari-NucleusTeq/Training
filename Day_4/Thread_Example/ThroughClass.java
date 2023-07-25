package Day_4.Thread_Example;

/**
 * Extending Thread class to MyThread
 */
class MyThread extends Thread{
    public void run(){
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running...");
            // Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Some error occurred while running the program !!");
        }
    }
}

public class ThroughClass {
    public static void main(String[] args) {
        System.out.println("Program illustrating the use of threads in java");
        int n = 5;
        for (int i = 0; i < n; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}
