import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating quadratic equation");
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a ");
        a = sc.nextInt();
        System.out.println("Enter the value of b ");
        b = sc.nextInt();
        System.out.println("Enter the value of c ");
        c = sc.nextInt();
        double pans,nans,rvalue;
        rvalue = b*b - 4 * a * c;
        pans = ((-(b)) + Math.sqrt(rvalue));
        nans = ((-b) - Math.sqrt(rvalue));
        System.out.println("The positive root of the given values is " + (pans)/(2*a));
        System.out.println("The negative root of the given values is " + (nans)/(2*a));
        sc.close();
    }
}
