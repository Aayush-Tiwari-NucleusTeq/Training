package Day_4.Running_Thread;

import java.util.Set;

class MyThreads extends Thread{
    public void run(){
        System.out.println("Thread message for " + Thread.currentThread().getId());
    }
}


public class UsingGetAllStackTrace {
    public static void main(String[] args) {
        System.out.println("Program of knowing current running threads through getallstacktrace");
        MyThreads obj1 = new MyThreads();
        MyThreads obj2 = new MyThreads();
        MyThreads obj3 = new MyThreads();
        obj1.start();
        obj2.start();
        obj3.start();
        
        System.out.println("\n \nActive threads are");
        Set<Thread> threads =Thread.getAllStackTraces().keySet();
        for (Thread thread : threads) {
            System.out.println("Thread - " + thread.getName() + " with id " +thread.getId() + " is running...");
        }
    }
}
