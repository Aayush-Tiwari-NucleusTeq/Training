package Day_4.Tasks;

public class Fibonacci extends Thread{
    int num;
    Fibonacci(int num){
        this.num = num;
    }
    public void run(){
        System.out.println("I am fibonacci thread " + num);
    }
}
