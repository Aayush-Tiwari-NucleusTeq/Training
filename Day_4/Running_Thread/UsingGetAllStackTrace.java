package Day_4.Running_Thread;

import java.util.Set;

class FirstThread extends Thread{
    FirstThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("First thread class message for " + Thread.currentThread().getId());
    }
}

class SecondThread extends Thread{
    SecondThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Second thread class message for " + Thread.currentThread().getId());
    }
}


public class UsingGetAllStackTrace {
    public static void main(String[] args) {
        System.out.println("Program of knowing current running threads through getallstacktrace");
        FirstThread obj1 = new FirstThread("M1");
        SecondThread obj2 = new SecondThread("M2");
        FirstThread obj3 = new FirstThread("M3");
        obj1.start();
        obj2.start();
        obj3.start();
        
        System.out.println("\n \nActive threads are");
        Set<Thread> threads =Thread.getAllStackTraces().keySet();
        for (Thread thread : threads) {
            System.out.println("[Thread] - " + thread.getName() + " with id " +thread.getId() + " is running...");
        }
    }
}
