package Day_4.Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The main class to run all the tasks together");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=1; i<=num; i++){
            arr[i-1] = i;
        }
        Thread reverseThread = new Thread(new ReverseList(arr));
        Thread sumThread = new Thread(new Sum(arr));
        Thread fibonacciThread = new Thread(new Fibonacci(num));
        reverseThread.start();
        sumThread.start();
        fibonacciThread.start();
        sc.close();
    }
}
