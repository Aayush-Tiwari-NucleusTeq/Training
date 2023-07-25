package Day_4.Thread_Example;

/**
 * Extending Thread class to ThreadA
 */
class ThreadA extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hii");
            }
        } catch (Exception e) {
            System.out.println("Some error occurred while running the program !!");
        }
    }
}

class ThreadB extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello");
            }
        } catch (Exception e) {
            System.out.println("Some error occurred while running the program !!");
        }
    }
}

public class ThroughClass {
    public static void main(String[] args) {
        System.out.println("Program illustrating the use of threads in java");
        // int n = 5;
        ThreadA objA = new ThreadA();
        ThreadB objB = new ThreadB();
        objA.start();
        objB.start();
    }
}
