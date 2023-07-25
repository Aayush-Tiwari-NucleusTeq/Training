package Day_4.Set_Priority;

class ThreadMaker extends Thread{
    ThreadMaker(String name){
        super(name);
    }
    public void run(){
        System.out.println("Inside run method in ThreadMaker " + Thread.currentThread().getName());
    }
}

public class SetPriority {
    public static void main(String[] args) {
        System.out.println("This is the program relating set the priority of threads");
        ThreadMaker thread1 = new ThreadMaker("T1");
        ThreadMaker thread2 = new ThreadMaker("T2");
        ThreadMaker thread3 = new ThreadMaker("T3");

        System.out.println("The priority of the thread 1 is -> " + thread1.getPriority());
        System.out.println("The priority of the thread 2 is -> " + thread2.getPriority());
        System.out.println("The priority of the thread 3 is -> " + thread3.getPriority());

        thread1.setPriority(2);
        thread2.setPriority(5);
        thread3.setPriority(10);
        System.out.println();
        System.out.println("The priority of the thread 1 is -> " + thread1.getPriority());
        System.out.println("The priority of the thread 2 is -> " + thread2.getPriority());
        System.out.println("The priority of the thread 3 is -> " + thread3.getPriority());
        System.out.println();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
