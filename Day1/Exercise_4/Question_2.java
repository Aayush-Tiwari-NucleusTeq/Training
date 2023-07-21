import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating area of triangle");
        float height,base;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        height = sc.nextFloat();
        System.out.println("Enter the height of the triangle");
        base = sc.nextFloat();
        float ans = (height*base)/2;
        System.out.println("Area of the triangle is " + ans);
        sc.close();
    }
}
