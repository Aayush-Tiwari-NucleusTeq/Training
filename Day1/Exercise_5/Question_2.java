package Day1.Exercise_5;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating sum of first n numbers");
        System.out.println("Enter the number to get the sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++)
        {
            ans += i;
        }
        System.out.println("The sum is -> " + ans);
        sc.close();
    }
}
