package Day1.Exercise_5;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating multiplication table");
        System.out.println("Enter the number for printing table");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(value + " x " + i + " = " + value * i);
        }
        sc.close();
    }
}
