package Day_4.Running_Thread;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread message ...");
    }
}

public class UsingThreadGroup {
    public static void main(String[] args) {
        System.out.println("Program illustrating getting all the current threads running");
        MyThread obj1 = new MyThread();
        MyThread obj2 = new MyThread();
        obj1.start();
        obj2.start();

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        int threadCount = threadGroup.activeCount();
        System.out.println(threadCount + " active threads are running");
        Thread currthreads[] = new Thread[threadCount];
        threadGroup.enumerate(currthreads);
        for (Thread thread : currthreads) {
            System.out.println(thread.getName() + " thread is running with the id " + thread.getId());
        }
    }
}
