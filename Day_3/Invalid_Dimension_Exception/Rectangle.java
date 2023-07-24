package Day_3.Invalid_Dimension_Exception;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Program to get the area of rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle -> ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the rectangle -> ");
        int width = sc.nextInt();
        try {
            if(length <= 0 || width <= 0){
                throw new InvalidDimensionException("Give proper length and width to calculate correct area !!");
            }
            System.out.println("The area of the rectangle for the given length and width is -> " + (length * width));
        } catch (InvalidDimensionException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
