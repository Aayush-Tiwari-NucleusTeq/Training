package Day_4.Thread_Example;

class MyThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Some error occurred");
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }

}

public class ThroughInterface {
    public static void main(String[] args) {
        System.out.println("Program illustrating an example of multithreading through interface");
        for (int i = 0; i < 5; i++) {
            Thread obj1 = new Thread(new MyThread());
            Thread obj2 = new Thread(new MyThread());
            obj1.start();
            obj2.start();
        }
    }
}
