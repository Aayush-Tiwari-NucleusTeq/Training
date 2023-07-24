package Day_3.Calculate_Area;

import java.util.Scanner;

class SomethingWentWrongException extends Exception {  
    public SomethingWentWrongException(String errorMessage) {  
    super(errorMessage);  
    }  
}  

/**
 * Can get the area of rectangle with the object of this class
 */
class CreateRectangle{
    int length;
    int breadth;

    /**
     * Initializing length and breadth with constructor
     * @param length
     * @param breadth
     */
    CreateRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int RectangleArea(){
        return length * breadth;
    }
}

/**
 * Main class
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle -> ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of rectangle -> ");
        int breadth = sc.nextInt();
        try {
            if(length < 0 || breadth <0){
                throw new SomethingWentWrongException("Give correct information , check twice before giving values");
            }
            CreateRectangle rectangle = new CreateRectangle(length, breadth);
            System.out.println("The area of the rectangle is -> " + rectangle.RectangleArea());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
