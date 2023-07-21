package Day1.Exercise_5;

import java.util.Scanner;

public class Question_3 {

    public static int fact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Program demonstrating factorial number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the factorial");
        int num = sc.nextInt();
        int ans = fact(num);
        System.out.println("The factorial of the given number is -> " + ans);
        sc.close();
    }
}
