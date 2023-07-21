package Day1.Exercise_5;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating printing pyramid pattern");
        System.out.println("Enter the number to print the pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
