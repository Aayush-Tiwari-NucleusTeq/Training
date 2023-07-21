package Day1.Exercise_6;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating rotating an array by 2 positions");
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        if(n<3)
        {
            System.err.println("Enter more than 2");
            System.exit(0);
        }

        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter " + (i+1) + "th value");
            arr[i] = sc.nextInt();
        }
        
        int first = arr[0];
        int second = arr[1];

        for(int i=0; i<n-2; i++)
        {
            arr[i] = arr[i+2];
        }

        arr[n-1] = second;
        arr[n-2] = first;

        System.out.println("Final array is");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
