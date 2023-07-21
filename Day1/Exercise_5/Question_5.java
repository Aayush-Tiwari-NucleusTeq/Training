package Day1.Exercise_5;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating reverse a number");
        System.out.println("Enter the number to reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0)
        {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        System.out.println("The reverse number is -> " + sum);
        sc.close();
    }
}
