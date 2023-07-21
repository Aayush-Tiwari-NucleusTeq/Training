package Day1.Exercise_5;

import java.util.Scanner;

public class Question_4 {
    public static boolean Armstrong(int n) {
        double sum = 0;
        int originaln = n;
        int d=0,dummy=n;
        while(dummy!=0)
        {
            dummy/=10;
            d++;
        }
        while(n!=0)
        {
            int rem = n %10;
            double val = Math.pow(rem, d);
            sum += val;
            n /= 10;
        }
        if(originaln == sum)
            return true;
        else 
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Program demonstrating Armstrong number");
        System.out.println("Enter the number to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = Armstrong(num);
        if (ans) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }
        sc.close();
    }
}
