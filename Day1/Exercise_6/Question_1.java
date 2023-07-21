package Day1.Exercise_6;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating largest number in an array");
        Scanner sc = new Scanner(System.in);
        int arr[] = {1000,2,3,40,5,6,300};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum number in an arrya is -> " + max);
        sc.close();
    }
}
