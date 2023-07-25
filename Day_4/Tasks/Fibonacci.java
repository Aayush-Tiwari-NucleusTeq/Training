package Day_4.Tasks;

public class Fibonacci extends Thread {
    int num;

    Fibonacci(int num) {
        this.num = num;
    }

    public void run() {
        int n1 = 0, n2 = 1, n3, i, count = num;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
        // System.out.println("I am fibonacci thread " + num);
    }
}
